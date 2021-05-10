/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-11 02:39:36
 * @modify date 2021-05-11 02:39:36
 * @desc 
 * 1. You are given a number n, representing the count of elements
 * 2. You are given n numbers.
 * 3. You are given a number x. 
 * 4. You are required to find the first index at which x occurs in array a.
 * 5. If x exists in array, print the first index where it is found otherwise print -1.
 */
public class FirstIndex {
    private static int firstI(int[] arr,int index,int ele) {
        if(index==arr.length){
            return -1;
        }
        if(ele==arr[index]){
            return index;
        }
        return firstI(arr, index+1,ele);
    }
    public static void main(String[] args) {
        int[] arr={7,6,7,8,7};
        int ele=7;
        System.out.println(firstI(arr,0,ele));
    }
}
