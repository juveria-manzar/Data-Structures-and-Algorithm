/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-10 23:28:15
 * @modify date 2021-05-10 23:28:15
 * @desc 
 * 1. You are given a number x.
 * 2. You are given another number n
 * 3. You are required to calculate x raised to the power n. Don't change the signature of power function .
 */

public class PowerLinear {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        else if(n%2!=0){
            return power(x,n-1)*x;
        }else{
            return power(x*x,n/2);
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        System.out.println(power(x,n));
    }
}
