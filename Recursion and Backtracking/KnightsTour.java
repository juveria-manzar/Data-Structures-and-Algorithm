import java.util.Scanner;

public class KnightsTour {

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printKnights(int[][] chess, int r, int c, int move) {

        if (r < 0 || c < 0 || r >= chess.length || c >= chess[0].length || chess[r][c] > 0) {
            return;
        } else if (move == chess.length * chess.length) {
            chess[r][c] = move;
            displayBoard(chess);
            chess[r][c] = 0;

            return;
        }
        chess[r][c] = move;
        printKnights(chess, r - 2, c + 1, move + 1);
        printKnights(chess, r - 1, c + 2, move + 1);
        printKnights(chess, r + 1, c + 2, move + 1);
        printKnights(chess, r + 2, c + 1, move + 1);
        printKnights(chess, r - 2, c - 1, move + 1);
        printKnights(chess, r - 1, c - 2, move + 1);
        printKnights(chess, r + 1, c - 2, move + 1);
        printKnights(chess, r + 2, c - 1, move + 1);
        chess[r][c] = 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] chess = new int[n][m];
        printKnights(chess, r, c, 1);
    }
}
