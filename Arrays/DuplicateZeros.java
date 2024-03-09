/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-16 00:38:32
 * @modify date 2021-03-16 00:38:32
 * @desc Given a fixed length array arr of integers, duplicate each occurrence of zero, 
 * shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function.
 * 
 * TC: O(n)
 * SC: O(1)
 */
public class DuplicateZeros{
    public static void duplicateZeros(int[] arr) {
        int zeros=0;
        for(int i:arr){
            if(i==0)
                zeros++;
        }

        int i=arr.length-1, j=arr.length+zeros-1;

        while(i!=j){
            insert(arr,i,j--);
            if(arr[i]==0){
                insert(arr,i,j--);
            }
            i--;
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }

    public static void insert(int[] arr, int i,int j){
        if(j<arr.length){
            arr[j]=arr[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        // int[] arr={1,2,3};
        duplicateZeros(arr);
    }
}