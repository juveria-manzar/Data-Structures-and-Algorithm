/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-19 10:52:50
 * @modify date 2021-04-19 10:52:50
 * @desc 
 * You are given an integer array A.
 * Decide whether it is possible to divide the array into some subarrays of 
 * even length such that first and last element of all subarrays will be even?<
 * Return "YES" if it is possible otherwise return "NO" (without quotes).
 * 
 * @constraint
 * 1 <= |A|, A[i] <= 106
 */

 public class EvenSubarrays{

    public static String solve(int[] arr) {
        String ans="NO";
        int n=arr.length;
        if(arr[0]%2 == 0 && arr[n-1]%2 == 0 && n%2 == 0){
            ans="YES";
        }
        return ans;
    }
     public static void main(String[] args) {
         int arr[]={2, 4, 8, 7, 6, 8};
         System.out.println(solve(arr));
     }
 }
