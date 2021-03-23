/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-19 23:24:56
 * @modify date 2021-03-19 23:24:56
 * @desc 
 * Rotate each ring of matrix anticlockwise by K elements
 * You are given a n*m matrix where n are the number of rows and m are the number of columns. 
 * You are also given n*m numbers representing the elements of the matrix.
 * You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.
 * https://www.pepcoding.com/resources/online-java-foundation/2d-arrays/ring-rotate-official/ojquestion 
 * You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
 * You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.
 * 
 */

import java.util.*;
import java.io.*;

public class ShellRotate {

    public static void rotateShell(int[][] arr, int s,int r){
        int[] oneD=fillOneDFromShell(arr,s);
        rotate(oneD,r);
        fillShellFromOneD(arr,s,oneD);
    }

    public static void fillOneDFromShell(int[][] arr, int s){
        int minr=s-1;
        int minc=s-1;

        int maxr=arr.length-s;
        int maxc=arr[0].length-s;

        int sz=2*(maxr-minr+maxc-minc); 


    }

    public static void rotate(int[] oneD,int r){
        r=r%oneD.length;
        if(r<0){
            r=r+oneD.length;
        }
        reverse(oneD,0,r-1);
        reverse(oneD,r,oneD.length-1);
        reverse(oneD,0,oneD.length-1);
    }

    public static void reverse(int[] oneD,int left,int right) {
        while(left<right){
            int temp=oneD[left];
            oneD[left]=oneD[right];
            oneD[right]=temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=s.nextInt();
		    }
		}

        int shell=s.nextInt();
        int r=s.nextInt();

        rotateShell(arr,shell,r);

        for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
            System.out.println();
		}
    }
}
