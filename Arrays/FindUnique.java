/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-25 10:04:03
 * @modify date 2021-02-25 10:04:03
 * @desc TC: O(n^2) can be improved uding bitwise.
 */
public class FindUnique {

    public static int findUnique(int[] arr) {

        for(int i=0 ; i< arr.length;i++) {
			boolean isUnique=false;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					isUnique=true;
					break;
				}
			}
			if(!isUnique) {
				return arr[i];
			}
		}
		return -1;
    }
    public static void main(String[] args) {
        int[] arr={2, 3, 1, 6, 3, 6, 2, 1, 5};
        System.out.println(findUnique(arr));
    }
}
