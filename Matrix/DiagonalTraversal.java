/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-02 02:40:00
 * @modify date 2021-05-02 02:40:00
 * @desc 1    2    3    4
        5    6    7    8
        9   10  11  12
        13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
Refer to the photo for a better clarification.
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.
For details check image.
 */

public class DiagonalTraversal {

    public static void upperLeftSolve(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;

        for(int d=0;d<n;d++){
            for(int r=0,c=d;c<m;r++,c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }

    public static void lowerRightSolve(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        for(int d=0;d<n;d++){
            for(int r=n-1,c=d;c<m;r--,c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }

    public static void lowerLeftSolve(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        for(int d=0;d<n;d++){
            for(int r=n-1,c=d;c>=0;r--,c--){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }

    public static void upperRightSolve(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;

        for(int d=0;d<n;d++){
            for(int r=0,c=(n-1-d);c>=0;c--,r++){
                //System.out.println("r"+" "+r+" c"+" "+c);
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        upperLeftSolve(mat);
        System.out.println("lower Right solve");
        lowerRightSolve(mat);
        System.out.println("lower Left solve");
        lowerLeftSolve(mat);
        System.out.println("upper right solve");
        upperRightSolve(mat);
    }
}
