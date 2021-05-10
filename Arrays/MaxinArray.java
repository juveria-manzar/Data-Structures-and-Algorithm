/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-11 01:57:50
 * @modify date 2021-05-11 01:57:50
 * @desc Write recursive and not iterative logic
 */
public class MaxinArray {
    public static int max(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int subMax=max(arr,index+1);
        int totalMax=Math.max(arr[index],subMax);
        return totalMax;
    }

    public static void main(String[] args) {
        int[] arr={65,8,40,2,55};
        System.out.print(max(arr,0));
    }
}
