/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 21:20:59
 * @modify date 2021-02-17 21:20:59
 * @desc Recursive Fibonacci: TC: O(2^N)
 * memoized solution TC: O(N)
 */
public class Fibonacci {
    private static int fib(int n){
        int[] table=new int[n+1];
        for(int i=0;i<table.length;i++){
            table[i]=-1;
        }
        if(n<=1){
            table[n]=n;
            return n;
        }
        else{
            if(table[n-2]==-1){
                table[n-2]=fib(n-2);
            }
            if(table[n-1]==-1){
                table[n-1]=fib(n-1);
            }
            return table[n-2]+table[n-1];
        }

    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(fib(n));
    }
}
