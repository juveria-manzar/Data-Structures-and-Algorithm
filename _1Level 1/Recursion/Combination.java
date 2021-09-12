/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-18 23:25:34
 * @modify date 2021-02-18 23:25:34
 * @desc [description]
 */

public class Combination {
    private static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return fact(n-1)*n;
        }
    }
    private static int comb(int n, int r){
        int nFact, rFact, nrFact;
        nFact=fact(n);
        System.out.println(nFact);
        rFact=fact(r);
        System.out.println(rFact);
        nrFact=fact(n-r);
        System.out.println(nrFact);
        return nFact/(rFact*nrFact);
    }
    public static void main(String[] args) {
        int n=5;
        int r=3;
        System.out.println(comb(n, r));
    }
}
