/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-15 20:41:19
 * @modify date 2021-02-15 20:41:19
 * @desc [description]
 */

 //Efficient Approach-Sliding-window
public class AverageOfSubArrays {
    private static double[] computeAverages(int[] arr,int k){
        double[] result=new double[arr.length-k+1];
        int win_start=0;
        double win_sum=0;
        for(int win_end=0;win_end<arr.length;win_end++){
            win_sum+=arr[win_end];

            if(win_end>=k-1){
                result[win_start]=win_sum/k;
                win_sum-=arr[win_start];
                win_start++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k=5;
        double[] result=computeAverages(arr,k);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" "); 
        }
        
    }
}
