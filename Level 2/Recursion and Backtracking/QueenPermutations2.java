/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-20 01:59:12
 * @modify date 2021-08-20 01:59:12
 * @desc 1. You are given a number n, representing the size of a n * n chess
 *       board. 2. You are required to calculate and print the permutations in
 *       which n queens can be placed on the n * n chess-board.
 * 
 * intuitive permutation-2
 */
public class QueenPermutations2 {
    public static void permuteQueens(int qpsf, int row, int col, boolean[] queens, int N, String asf) {

        if(row==N){
            if(qpsf==N){
                System.out.println(asf);
                System.out.println();
            }
            return;
        }
        //for N=2 => box has 3 choices q1,q2 or nothing

        //yes choice
        for(int q=0;q<queens.length;q++){
            if(queens[q]==false){
                queens[q]=true;
                if(col<N-1){
                    permuteQueens(qpsf+1, row, col+1, queens, N, asf+"q"+(q+1)+"\t");
                }
                else{
                    permuteQueens(qpsf+1, row+1, 0, queens, N, asf+"q"+(q+1)+"\n");
                }
                queens[q]=false;
            }
        }

        //no choice
        if(col<N-1){
            permuteQueens(qpsf, row, col+1, queens, N, asf+"-\t");
        }
        else{
            permuteQueens(qpsf, row+1, 0, queens, N, asf+"-\n");
        }
    }

    public static void main(String[] args) {
        int N = 2;
        boolean[] queens = new boolean[2];

        permuteQueens(0, 0, 0, queens, N, "");
    }
}
