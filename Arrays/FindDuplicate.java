/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-25 10:26:44
 * @modify date 2021-02-25 10:26:44
 * @desc [description]
 */

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<i;j++){
                if(arr[i]==arr[j] && i!=j){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //int[] arr={0, 3, 3, 5, 4, 1, 2};
        int[] arr={0, 7, 2, 5, 4, 7, 1, 3, 6};
        System.out.println(findDuplicate(arr));
    }
}
