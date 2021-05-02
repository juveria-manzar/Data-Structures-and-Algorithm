/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-02 11:19:34
 * @modify date 2021-05-02 11:19:34
 * @desc 
 * 1. You are given a number n, representing the number of rows and columns of a square matrix.
 * 2. You are given n * n numbers, representing elements of 2d array a. 
 * Note - Each row and column is sorted in increasing order.
 * 3. You are given a number x.
 * 4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
 * 5. In case element is not found, print "Not Found".
 */

public class SearchInSorted {

    public static void solve(int[][] mat,int target) {
        int n=mat.length;
        int m=mat[0].length;

        int r=0,c=m-1;
        while(c>=0&&r<n){
            int point=mat[r][c];
            if(target==point){
                System.out.print(r+"\n"+c);
                return;
            }
            else if(target>point){
                r++;
            }
            else if(target<point){
                c--;
            }
        }
        System.out.print(r+"\n"+c);
    }
    public static void main(String[] args) {
        int[][] mat={{11,12,13,14},{21,22,23,23},{31,32,33,34},{41,42,43,44}};
        int target=43;
        solve(mat,target);
    }    
}
