/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-17 21:21:08
 * @modify date 2021-04-17 21:21:08
 * @desc 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print a bar chart representing value of arr a.
 */
public class BarChart {
    public static void main(String[] args) {
        int arr[]=new int[]{15,30,40,4,11,9};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
