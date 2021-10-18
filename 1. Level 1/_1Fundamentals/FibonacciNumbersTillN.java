/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 21:05:26
 * @modify date 2021-02-17 21:05:26
 * @desc Iterative TC: O(N)
 */
import java.util.*;
public class FibonacciNumbersTillN {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

