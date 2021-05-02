/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-25 23:48:03
 * @modify date 2021-03-25 23:48:03
 * @desc 
 * 1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
 * 2. You are required to find the saddle price of the given matrix and print the saddle price. 
 * 3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
 * 
 * Min in row max in value;
 */
public class SaddlePoint {

  public static void solve(int[][] mat) {
    int n=mat.length;
    int m=mat[0].length;
    
    for(int r=0;r<n;r++){
      int min=mat[r][0];
      int minC=0;
      for(int c=0;c<m;c++){
        if(mat[r][c]<min){
          min=mat[r][c];
          minC=c;
        }
      }

      boolean flag=true;
      for(int k=0;k<n;k++){
        if(mat[k][minC]>min){
          flag=false;
          break;
        }
      }
      if(flag){
        System.out.println(min);
        return;
      }
    }
    System.out.println("Invalid input");
  }
  public static void main(String[] args) {
      int[][] mat={{13,11,12,14},{22,23,24,21},{44,34,43,40},{41,32,31,33}};
      solve(mat);
  }  
}
