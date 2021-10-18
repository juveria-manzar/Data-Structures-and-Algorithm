/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-11 01:44:46
 * @modify date 2021-05-11 01:44:46
 * @desc 
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the elements of array from beginning to end each in a separate line.
 */
public class DisplayArray {

    public static void displayArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        displayArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        displayArray(arr,0);
    }
}
