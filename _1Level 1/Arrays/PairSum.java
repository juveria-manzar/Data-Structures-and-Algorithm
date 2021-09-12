/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-26 03:45:50
 * @modify date 2021-02-26 03:45:50
 * @desc Problem Level: MEDIUM
        Problem Description: 
            You have been given an integer array/list(ARR) and a number X. 
            Find and return the total number of pairs in the array/list which sum to X. 
 */
public class PairSum {

    //TC- o(n*n)
    public static void pairSum(int[] a,int k) {
        for(int i=0; i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] + a[j] == k) {
					System.out.println(Math.min(a[i], a[j])  +" " + Math.max(a[i], a[j]) );
				}
            }
        }
    }
    public static void main(String[] args) {
        // int[] arr={2, 8, 10, 5, -2, 5};
        // int k=10;
        int[] arr={1, 3, 6, 2, 5, 4, 3, 2, 4};
        int k=7;
        pairSum(arr,k);
    }
}
