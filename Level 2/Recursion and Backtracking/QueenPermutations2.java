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
    
    public static void permuteQueens(int row,int col, int selectedSoFar,boolean[] queens,int N, String ansSoFar){

        if(row==N){
            if(selectedSoFar==N){
                System.out.println(ansSoFar);
            }
            return;
        }
        //yes 
        for(int i=0;i<queens.length;i++){
            if(queens[i]==false){
                queens[i]=true;
                if(col<N-1){
                    permuteQueens(row, col+1, selectedSoFar+1, queens, N, ansSoFar+"q"+(i+1)+"\t");
                }else{
                    permuteQueens(row+1, 0, selectedSoFar+1, queens, N, ansSoFar+"q"+(i+1)+"\n");
                }
            }
        }
        //no
        if(col<N-1){
            permuteQueens(row, col+1, selectedSoFar, queens, N, ansSoFar+"-\t");
        }else{
            permuteQueens(row+1, 0, selectedSoFar, queens, N, ansSoFar+"-\n");
        }
    }
    public static void main(String[] args) {
        int N = 2;
        boolean[] queens = new boolean[2];

        permuteQueens(0, 0, 0, queens, N, "");
    }
}
