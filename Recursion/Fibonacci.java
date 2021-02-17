/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 21:02:51
 * @modify date 2021-02-17 21:02:51
 * @desc Fibonacci Iterative TC: O(n)
 * Recursive TC: O(2^n)
 */
public class Fibonacci {
    static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-2) + fib(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
    }
}
