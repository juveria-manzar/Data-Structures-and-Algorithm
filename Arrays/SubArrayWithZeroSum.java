import java.util.HashMap;

/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-19 04:20:44
 * @modify date 2021-04-19 04:20:44
 * @desc 
 * Given an array of integers A, find and return 
 * whether the given array contains a non-empty subarray with a sum equal to 0.
 * If the given array contains a sub-array with sum zero return 1 else return 0.
 * @constarints
 * 1 <= |A| <= 100000
 * -10^9 <= A[i] <= 10^9
 */

public class SubArrayWithZeroSum{
    public static int solve(int[] arr){
        HashMap<Integer,Integer> preSumMap=new HashMap<>();
        preSumMap.put(0,arr[0]);
        for(int i=1;i<arr.length;i++){
            if(preSumMap.containsValue(preSumMap.get(i-1)+arr[i])){
                return 1;
            }
            else{
                preSumMap.put(i,preSumMap.get(i-1)+arr[i]);
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,2};
        System.out.println(solve(arr));
    }
}