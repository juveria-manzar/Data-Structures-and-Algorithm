/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-11 02:41:13
 * @modify date 2021-05-11 02:41:13
 * @desc 1. You are given a number n, representing the count of elements.
 * 2. You are given n numbers.
 * 3. You are given a number x. 
 * 4. You are required to find the last index at which x occurs in array a.
 * 5. If x exists in array, print the last index where it is found otherwise print -1.
 */
//Last Index
public class LastIndex {
    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length)
            return -1;
        
        int lis=lastIndex(arr,idx+1,x);
        if(lis!=-1)
            return lis;
        else if(arr[idx]==x)
            return idx;
        else
            return -1;
    }
    public static void main(String[] args) {
        int[] arr={7,6,7,8};
        int ele=7;
        System.out.println(lastIndex(arr,0,ele));
    }
}
