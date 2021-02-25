/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-25 10:44:53
 * @modify date 2021-02-25 10:44:53
 * @desc TC:O(n^2)
 */
public class ArrayIntersection {
    public static void findIntersection(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={2, 6, 8, 5, 4, 3};
        int[] arr2={2, 3, 4, 7};
        findIntersection(arr1, arr2);
    }
}
