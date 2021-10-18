/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-30 07:51:15
 * @modify date 2020-12-30 07:51:15
 * @desc [Easy]
 */

public class SpanOfArray {
    public static void main(String[] args) {
        int arr[]=new int[]{15,30,40,4,11,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        int result=max-min;
        System.out.println(result);
    }
}
