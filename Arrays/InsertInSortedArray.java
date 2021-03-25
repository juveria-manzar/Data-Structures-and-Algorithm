/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-26 02:41:37
 * @modify date 2021-03-26 02:41:37
 * @desc TC: O(n)
 */
public class InsertInSortedArray {
    //Brute Force
    public static int[] findRightPosition(int[] arr,int n){
        int pos=-1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[n-1]){
                pos=i;
                break;
            }
        }

        int temp=arr[n-1];
        for(int i=n-1;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,30,31,34,37,44,33};
        arr=findRightPosition(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
