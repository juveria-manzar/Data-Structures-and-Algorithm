import java.util.*;

public class SolveSudoku {
    public static void solveSudoku(int[][] board, int i, int j) {
        if (j == board.length) {
            i++;
            j = 0;
        }
        if (i == board.length) {
            print(board);
            return;
        }
        if (board[i][j] != 0) {
            solveSudoku(board, i, j + 1);
        } else {
            for (int d = 1; d <= 9; d++) {
                if (canPlace(board, i, j, d)) {
                    board[i][j] = d;
                    solveSudoku(board, i, j + 1);
                    board[i][j] = 0;
                }
            }
        }
    }

    public static boolean canPlace(int[][] board, int i, int j, int d) {

        // row check
        for (int c = 0; c < 9; c++) {
            if (board[i][c] == d) {
                return false;
            }
        }

        // col check
        for (int r = 0; r < 9; r++) {
            if (board[r][j] == d) {
                return false;
            }
        }

        // submatrix check

        int subRowStart = (i / 3) * 3;
        int subColStart = (j / 3) * 3;

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[subRowStart + r][subColStart + c] == d) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void print(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        solveSudoku(arr, 0, 0);
    }
}
