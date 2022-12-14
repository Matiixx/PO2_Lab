import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int size = 5;
        boolean isCorrectSize = false;
        do {
            try {
                System.out.println("Podaj liczbe calkowita wieksza od 1");
                Scanner sc = new Scanner(System.in);
                size = sc.nextInt();
                if (size < 2) throw new Exception();
                isCorrectSize = true;
            } catch (Exception e) {
                isCorrectSize = false;
                System.out.println("BLAD: Podaj jeszcze raz");
            }
        } while (!isCorrectSize);

        Board b = new Board(size);

        b.printBoard();

        String directionInput = "q";
        do {
            try {
                System.out.println("Podaj [l][r][u][d][q]");
                Scanner sc = new Scanner(System.in);
                directionInput = sc.nextLine();
                if (directionInput.length() > 1) throw new OptionNotRecognizedException();
                
                if (!directionInput.equals("q")) {
                    Direction nextDirection =
                            switch (directionInput) {
                                case "l" -> Direction.LEFT;
                                case "r" -> Direction.RIGHT;
                                case "u" -> Direction.UP;
                                case "d" -> Direction.DOWN;
                                default -> throw new OptionNotRecognizedException();
                            };

                    b.step((board, i0, j0, direction) -> {
                        if (i0 + direction.getX() < 0) {
                            System.out.println("Za granica x<0");
                            return false;
                        }
                        if (i0 + direction.getX() >= b.getSize()) {
                            System.out.println("Za granica x>size");
                            return false;
                        }
                        if (j0 + direction.getY() < 0) {
                            System.out.println("Za granica y<0");
                            return false;
                        }
                        if (j0 + direction.getY() >= 2 * b.getSize()) {
                            System.out.println("Za granica y>size");
                            return false;
                        }
                        if (b.isWall(i0 + direction.getX(), j0)) {
                            System.out.println("Sciana");
                            return false;
                        }
                        if (b.isWall(i0, j0 + direction.getY())) {
                            System.out.println("Sciana");
                            return false;
                        }
                        return true;
                    }, nextDirection);

                    b.printBoard();
                }
            } catch (OptionNotRecognizedException e) {
                System.out.println("Nie rozpoznano akcji");
            }

        } while (!directionInput.equals("q"));
    }
}