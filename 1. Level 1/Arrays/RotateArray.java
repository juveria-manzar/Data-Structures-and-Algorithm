/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-25 11:11:17
 * @modify date 2021-02-25 11:11:17
 * @desc Problem Level: MEDIUM
        Problem Description: 
             You are given an int array 'a' and a number k.
             Rotate the array a, k times to the right (for positive values of k), and to
             the left for negative values of k.
 */
public class RotateArray {

    public static void reverse(int[] a, int i, int j) {
     int le=i;
     int ri=j;
     while(le<ri){
         int temp=a[le];
         a[le]=a[ri];
         a[ri]=temp;

         le++;
         ri--;
     }   
    }

    //TC: O(n*n)
    public static void rotateArray(int[] a, int k){
        k=k%a.length;
        if(k<0){
            k=k+a.length;
        }
        // part -1 revrse
        reverse(a, 0,a.length-k-1 );
        
        // part -2 revrse
        reverse(a,a.length-k,a.length-1 );

        // part -3 revrse all
        reverse(a,0,a.length-1 );

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
      }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
        rotateArray(arr,k);
    }
}
