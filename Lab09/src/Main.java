import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(Rank.ACE);

        Deck d = new Deck();

        Blackjack ob = new Blackjack.Builder("Gracz", d).build();

        System.out.println("0 - PLAY\n1 - STOP\n2 - QUIT");
        Scanner sc = new Scanner(System.in);
        int iter = 0;
        while (iter < ob.getMax_it()) {
            int nextMove = sc.nextInt();

            if (nextMove != 0 && nextMove != 1) return;

            else if (nextMove == 0) {
                ob.play();
                if (ob.checkWin()) return;
            } else if (nextMove == 1) {
                ob.stop();
                return;
            }

            iter++;
        }

    }


}