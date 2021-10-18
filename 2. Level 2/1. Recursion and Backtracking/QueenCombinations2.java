/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-20 03:42:58
 * @modify date 2021-08-20 03:42:58
 * @desc 1. You are given a number n, representing the size of a n * n chess
 *       board. 2. You are required to calculate and print the combinations in
 *       which n queens can be placed on the n * n chess-board.
 * 
 *       Queen chooses
 */
public class QueenCombinations2 {

    public static void placeQueens(int qpsf, int lpr, int lpc, int N, int[][] chess) {
        // base case

        if(qpsf==N){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(chess[i][j]==1){
                        System.out.print("q\t");
                    }else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        for (int i = lpr; i < N; i++) {
            for (int j = (i == lpr) ? lpc + 1 : 0; j < N; j++) {
                chess[i][j] = 1;
                placeQueens(qpsf + 1, i, j, N, chess);
                chess[i][j]=0;
            }
        }
    }

    public static void main(String[] args) {
        int N = 2;
        int[][] chess = new int[N][N];

        placeQueens(0, 0, -1, N, chess);
    }
}
