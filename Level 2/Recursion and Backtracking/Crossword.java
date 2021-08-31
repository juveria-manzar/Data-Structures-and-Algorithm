import java.util.*;

public class Crossword {

    public static void solution(char[][] board, String[] words, int idx) {

        if (idx == words.length) {
            print(board);
            return;
        }

        String word = words[idx];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '-' || board[i][j] == word.charAt(0)) {
                    if (canPlaceHorz(board, word, i, j) == true) {
                        boolean[] pbm = placeHorz(board, word, i, j);
                        solution(board, words, idx + 1);
                        unplaceHorz(board, word, i, j, pbm);
                    }
                    if (canPlaceVert(board, word, i, j) == true) {
                        boolean[] pbm = placeVert(board, word, i, j);
                        solution(board, words, idx + 1);
                        unplaceVert(board, word, i, j, pbm);
                    }
                }
            }
        }
    }

    public static boolean canPlaceHorz(char[][] board, String word, int i, int j) {
        if (j - 1 >= 0 && board[i][j - 1] != '+') {
            return false;
        } else if (j + word.length() < board[0].length && board[i][j + word.length()] != '+') {
            return false;
        }

        for (int c = 0; c < word.length(); c++) {
            if (j + c >= board[0].length) {
                return false;
            }
            if (board[i][j + c] != '-' && board[i][j + c] != word.charAt(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] placeHorz(char[][] board, String word, int i, int j) {
        boolean[] pbm = new boolean[word.length()];
        for (int c = 0; c < word.length(); c++) {
            if (board[i][j + c] == '-') {
                pbm[c] = true;
                board[i][j + c] = word.charAt(c);
            } else {
                continue;
            }
        }
        return pbm;
    }

    public static void unplaceHorz(char[][] board, String word, int i, int j, boolean[] pbm) {
        for (int c = 0; c < word.length(); c++) {
            if (pbm[c] == true) {
                board[i][j + c] = '-';
            }
        }
    }

    public static boolean canPlaceVert(char[][] board, String word, int i, int j) {
        if (i - 1 >= 0 && board[i - 1][j] != '+') {
            return false;
        } else if (i + word.length() < board.length && board[i + word.length()][j] != '+') {
            return false;
        }

        for (int c = 0; c < word.length(); c++) {
            if (i + c >= board.length) {
                return false;
            }
            if (board[i + c][j] != '-' && board[i + c][j] != word.charAt(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] placeVert(char[][] board, String word, int i, int j) {
        boolean[] pbm = new boolean[word.length()];
        for (int c = 0; c < word.length(); c++) {
            if (board[i + c][j] == '-') {
                pbm[c] = true;
                board[i + c][j] = word.charAt(c);
            } else {
                continue;
            }
        }
        return pbm;
    }

    public static void unplaceVert(char[][] board, String word, int i, int j, boolean[] pbm) {
        for (int c = 0; c < word.length(); c++) {
            if (pbm[c] == true) {
                board[i + c][j] = '-';
            }
        }
    }

    public static void print(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] board = new char[10][10];

        for (int i = 0; i < board.length; i++) {
            String str = scn.next();
            board[i] = str.toCharArray();
        }

        int n = scn.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }

        solution(board, words, 0);
    }
}
