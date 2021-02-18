/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-18 23:36:52
 * @modify date 2021-02-18 23:36:52
 * @desc [description]
 */

public class CombinationPascals {
    private static int comb(int n, int r){
        if(r==0||n==r){
            return 1;
        }
        else{
            return comb(n-1, r-1)+comb(n-1, r);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int r=3;
        System.out.println(comb(n, r));
    }
}
