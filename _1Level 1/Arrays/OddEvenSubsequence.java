/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-11 11:46:52
 * @modify date 2021-04-11 11:46:52
 * @desc Odd Even Subsequences
 * Given an array of integers A of size N. Find the longest subsequence of A which is odd-even.
 * A subsequence is said to odd-even in the following cases:
 *      The first element of the subsequence is odd, second element is even, third element is odd and so on. 
 * For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
 * The first element of the subsequence is even, second element is odd, third element is even and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
Return the maximum possible length of odd-even subsequence.
Note: An array B is a subsequence of an array A if B can be obtained from A by deletion of several (possibly, zero or all) elements.
 */
public class OddEvenSubsequence {

    public static int solve(int[] a){
        int flag=0, count=0;

        if(a[0]%2==0)
            flag=0;
        else 
            flag=1;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0&&flag==0){
                count++;
                flag=1;
            }
            else if(a[i]%2!=0&&flag==1){
                count++;
                flag=0;
            }
        }   
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1, 2, 2, 5, 6};
        System.out.print(solve(arr));
    }
}
