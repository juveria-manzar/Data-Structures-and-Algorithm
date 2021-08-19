/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-20 00:32:10
 * @modify date 2021-08-20 00:32:10
 * @desc 
 * 1. You are given a number n, representing the size of a n * n chess board.
 * 2. You are required to calculate and print the permutations in which n queens can be placed on the 
 * n * n chess-board. 
 * 
 * Intuitive-> permutation1 approach
 */
public class QueensPermutation1 {

    public static void placeQueen(int currQueen, int N, int[][] chess){
        if(currQueen==N){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(chess[i][j]!=0){
                        System.out.print("q"+chess[i][j]+"\t");
                    }else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return; 
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               if(chess[i][j]==0){
                   chess[i][j]=currQueen+1;
                   placeQueen(currQueen+1,N,chess);
                   chess[i][j]=0;
               }
            }
        }
    }
    public static void main(String[] args) {
        int N=2;
        int[][] chess = new int[N][N];
        placeQueen(0,N,chess);
    }
}
