import java.util.Random;

public class Board {
    private final char[][] board;
    private final int size;

    private int playerX;
    private int playerY;

    public Board(int size) {
        this.size = size;
        board = new char[size][2 * size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size; j++) {
                board[i][j] = ' ';
                if (r.nextDouble() <= 0.3)
                    board[i][j] = 'x';
            }
        }
        board[playerX = Math.abs(r.nextInt()) % size][playerY = Math.abs(r.nextInt()) % (2 * size)] = 'o';

    }

    public int getSize() {
        return size;
    }

    public char[][] getBoard() {
        return board;
    }

    public int getPlayerX() {
        return playerX;
    }

    public int getPlayerY() {
        return playerY;
    }

    public boolean isWall(int x, int y) {
        return (board[x][y] == 'x');
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size; j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println(playerX + " " + playerY);
    }

    void step(CheckStep cs, Direction dir) {
        if (cs.check(board, playerX, playerY, dir)) {
            board[playerX][playerY] = ' ';
            playerX += dir.getX();
            playerY += dir.getY();
            board[playerX][playerY] = 'o';
        }
    }
}
