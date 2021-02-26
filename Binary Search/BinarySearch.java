/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-27 05:20:37
 * @modify date 2021-02-27 05:20:37
 * @desc Time Complexity(logn)
 */
public class BinarySearch {

    public static void search(int[] arr,int l, int r,int k) {
        while(l<=r){
            int mid=(l+r)/2;
            if(k>arr[mid]){
                l=mid+1;
            }
            else if(k<arr[mid]){
                r=mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int k=10;
        search(arr,0,arr.length-1,k);
    }

}
