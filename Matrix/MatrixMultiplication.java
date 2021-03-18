import java.util.Scanner;

/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-18 23:45:05
 * @modify date 2021-03-18 23:45:05
 * @desc 1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".
 */
public class MatrixMultiplication {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int r1=s.nextInt();
        int c1=s.nextInt();
        int[][] arr1=new int[r1][c1];
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=s.nextInt();
            }
        }

        int r2=s.nextInt();
        int c2=s.nextInt();
        int[][] arr2=new int[r2][c2];

        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=s.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid Input");
            return;
        }
        int[][] prod=new int[r1][c2];
        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                for(int k=0;k<c1;k++){ //arr[0].length==col
                    prod[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
}
