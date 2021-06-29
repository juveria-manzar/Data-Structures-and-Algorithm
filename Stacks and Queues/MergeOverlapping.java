/**
 * @author Juveria
 * @create date 2021-06-20 19:15:33
 * @modify date 2021-06-20 19:15:33
 * @desc Medium
 */


import java.util.*;
public class MergeOverlapping {
    
    public static void mergeOverlappingIntervals(int[][] arr){
        
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[][] arr=new int[n][2];  
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        mergeOverlappingIntervals(arr);
    }
}
