/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-18 22:42:23
 * @modify date 2021-04-18 22:42:23
 * @desc Sub Array Sum
 */

import java.util.*;

public class SubArraySum{

    public static int findSubarraySum(int start,int end,int[] prefixSum) {
        int sum=0;
        if(start==0)
            sum=prefixSum[end];
        else 
            sum=prefixSum[end]-prefixSum[start-1];
        return sum;
        
    }

    // TC:O(n*q)
    // public static int findSubarraySum(int start,int end,int[] arr){
    //     int sum=0;
    //     for(int i=start;i<=end;i++){
    //         sum+=arr[i];
    //     }
    //     return sum;
    // }
    public static void main(String[] args) {
        int[] arr={2,3,7,1,9};
        Scanner scn=new Scanner(System.in);
        int q=scn.nextInt();
        int[] prefixSum=new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        while(q>0){
            int start=scn.nextInt();
            int end=scn.nextInt();
            System.out.println(findSubarraySum(start,end,prefixSum));
            q--;
        }
    }
}
