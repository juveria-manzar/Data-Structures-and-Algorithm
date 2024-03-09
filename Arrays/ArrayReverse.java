/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-15 21:07:10
 * @modify date 2021-03-15 21:07:10
 * @desc Array Reverse Display
 */
public class ArrayReverse {
    public static void displayArray(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        displayArray(arr,index+1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        displayArray(arr,0);
    }
}
