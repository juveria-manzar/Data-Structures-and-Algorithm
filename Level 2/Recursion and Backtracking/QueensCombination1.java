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
 */
public class QueensCombination1 {
    public static void placeQueen(int qpsf,int r,int c,String asf,int N){
        //base condition
        if(r==N){
            if(qpsf==N){
                System.out.println(asf);
                System.out.println();
            }
            return;
        }
        //yes call
        if(c<N-1){
            placeQueen(qpsf+1, r, c+1, asf+"q ", N);
        }else{
            placeQueen(qpsf+1, r+1, 0, asf+"q\n", N);
        }
        //no call
        if(c<N-1){
            placeQueen(qpsf, r, c+1, asf+"- ", N);
        }else{
            placeQueen(qpsf, r+1, 0, asf+"-\n", N);
        }
    }
    public static void main(String[] args) {
        int N=2;
        placeQueen(0,0,0,"",N);
    }
}
