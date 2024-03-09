import java.util.Arrays;

/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-11 12:55:22
 * @modify date 2021-04-11 12:55:22
 * @desc You are given an Array A of size N.
 * Find for how many elements, there is a strictly smaller element and a strictly greater element.
 */
public class SmallerAndGreater {
    public static int solve(int[] arr) {
        int count=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(min<arr[i]&& arr[i]<max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3};
        System.out.println(solve(arr));
    }
}
