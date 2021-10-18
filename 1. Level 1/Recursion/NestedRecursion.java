/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 02:18:50
 * @modify date 2021-02-17 02:18:50
 * @desc nested call to a recursive function 
 */

public class NestedRecursion {
    private static int fun(int n){
        if(n>100){
            return n-10;
        }
        else{
            return fun(fun(n+11));
        }
    }

    public static void main(String[] args) {
        int n=95;
        System.out.print(fun(n));
           
    }
}
