/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-27 01:01:40
 * @modify date 2020-12-27 01:01:40
 * @desc Triplet Sum
 *          an unsroted array
 *          Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
            Output: 12, 3, 9
            Input: array = {1, 2, 3, 4, 5}, sum = 9
            Output: 5, 3, 1
    SOlution:
    approach-1: Brute Force Solution:
                3 nested loops representing ith,jth and kth element if the sum is equal to k then return 1
    Approach 2:

 */

import java.util.*;

public class TripletSum{
    static int findTriplet(int arr[], int k){
        if(arr.length<3){
            return 0;
        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i++){
            int start=i+1;
            int end=arr.length-1;
            while(start<end){
                int curr_sum=arr[i]+arr[start]+arr[end];
                if(curr_sum==k){
                    return 1;
                }
                else if(curr_sum>k){
                    end--;
                }
                else if(curr_sum<k){
                    start++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // int arr[]={12, 3, 4, 1, 6, 9};
        int arr[]={1, 4, 45, 6, 10, 8};
        int k=13;
        int res=findTriplet(arr,k);
        System.out.println(res);
    }
}