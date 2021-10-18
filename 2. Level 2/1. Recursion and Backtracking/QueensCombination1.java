/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-16 04:31:14
 * @modify date 2021-08-16 04:31:14
 * @desc 
 * level->box
 * optons->queens
 * queens identical
 * 
 * 1. You are given a number n, representing the size of a n * n chess board.
 * 2. You are required to calculate and print the combinations in which n queens can be 
 * placed on the n * n chess-board. 
 * 
 * Combination 1 intuition
 * 
 * combination mai box choose krta hai that means 'N', kyuki N>r toh vo choose krskta hai kis queen(r) ko place krna hai
 * isliye yes no ki call lgit hai
 */
public class QueensCombination1 {

    public static void combination(int row,int col,int selectedSoFar, String ansSof, int N) {

        if(row==N){
            if(selectedSoFar==N){
                System.out.println(ansSof);
            }
            return;
        }
        
        if(col<N-1){
            combination(row, col+1, selectedSoFar+1, ansSof+"q ", N);
        }
        else{
            combination(row+1, 0, selectedSoFar+1, ansSof+"q\n", N);
        }

        if(col<N-1){
            combination(row, col+1, selectedSoFar, ansSof+"- ", N);
        }
        else{
            combination(row+1, 0, selectedSoFar, ansSof+"-\n", N);
        }
    }

    public static void main(String[] args) {
        int N=2;
        combination(0,0,0,"",N);
    }
}
