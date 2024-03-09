/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-10 23:32:27
 * @modify date 2021-05-10 23:32:27
 * @desc 1. You are given a number x.
 * 2. You are given another number n.
 * 3. You are required to calculate x raised to the power n. Don't change the signature of power function.
 * 
 * Note1 -> The previous version expects the call stack to be of n height. 
 * This function expects call function to be only log(n) high.
 */
import java.util.*;
public class PowerLogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        if(n==0)
            return 1;
            
        int xrnb2=power(x,n/2);
        int xrn=xrnb2*xrnb2;
        
        if(n%2==1){
            xrn*=x;
        }
        return xrn;
    }
}
