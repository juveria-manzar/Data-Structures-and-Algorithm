/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-11 19:58:04
 * @modify date 2021-04-11 19:58:04
 * @desc Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. 
 * a) First element is replaced by multiplication of first and second. 
 * b) Last element is replaced by multiplication of last and second last.
 */
public class MulPrevNext {
    public static int[] solve(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int[] res=new int[arr.length];
        res[0]=arr[0]*arr[1];
        res[res.length-1]=arr[arr.length-1]*arr[arr.length-2];
        for(int i=1;i<arr.length-1;i++){
            res[i]=arr[i-1]*arr[i+1];
        }
        return res;
    }
    public static void main(String[] args) {
     int arr[]={1, 2, 3, 4, 5};
     arr=solve(arr);   
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }
    }
}
