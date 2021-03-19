/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-19 23:11:42
 * @modify date 2021-03-19 23:11:42
 * @desc 
 * 1. You are given a number n, representing the number of rows and number of columns.
 * 2. You are given n*n numbers, representing elements of 2d array a.
 * 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*
 */

import java.util.*;
import java.io.*;
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=s.nextInt();
		    }
		}

        //transpose
        for(int i=0;i<arr.length;i++){
		    for(int j=i;j<arr[0].length;j++){
		        int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
		    }
		}

        //reverse rows

        for(int i=0;i<arr.length;i++){
            int left=0;
            int right=arr[0].length-1;

            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;

                left++;
                right--;
            }
        }

        for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(arr[i][j]+" ");
		    }
            System.out.println();
		}
    }
}
