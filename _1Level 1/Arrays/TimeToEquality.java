/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-11 11:47:56
 * @modify date 2021-04-11 11:47:56
 * @desc 
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
 * Find the minimum time in seconds to make all elements of the array equal.
 */
public class TimeToEquality {
    public static int solve(int[] arr){
        int minTime=0,greatest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>greatest){
                greatest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            minTime+=greatest-arr[i];
        }
        return minTime;
    }
    public static void main(String[] args) {
        int[] arr={2, 4, 1, 3, 2};
        System.out.print(solve(arr));
    }
}
