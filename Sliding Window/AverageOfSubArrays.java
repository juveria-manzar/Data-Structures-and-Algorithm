/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-20 19:36:06
 * @modify date 2020-12-20 19:36:06
 * @desc Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. 
Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.
 */

 //Efficient Approach-Sliding-window
public class AverageOfSubArrays {
    private static double[] computeAverages(int[] arr,int k){
        double[] result=new double[arr.length-k+1];
        int win_start=0;
        double win_sum=0;
        for(int win_end=0;win_end<arr.length;win_end++){
            win_sum+=arr[win_end];

            if(win_end>=k-1){
                result[win_start]=win_sum/k;
                win_sum-=arr[win_start];
                win_start++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k=5;
        double[] result=computeAverages(arr,k);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" "); 
        }
        
    }
}
