/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 01:53:33
 * @modify date 2021-02-17 01:53:33
 * @desc Indirect Recursion: function calling a function
 */

public class IndirectRecursion {
    private static void funcA(int n){
        if(n>0){
            System.out.print(n+" ");
            funcB(n-1);
        }
    }
    private static void funcB(int n){
        if(n>1){
            System.out.print(n+" ");
            funcA(n/2);
        }
    }
    public static void main(String[] args) {
        int n=20;
        funcA(n);
    }
}
