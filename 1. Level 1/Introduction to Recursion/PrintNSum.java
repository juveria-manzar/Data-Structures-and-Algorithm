/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-17 05:31:04
 * @modify date 2021-02-17 05:31:04
 * @desc Iterative Loop will be better
 */
public class PrintNSum {
    private static int printSum(int n){
        if(n==0){
            return 0;
        }
        else{
            return printSum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printSum(n));
    }
}
