/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-05 11:54:21
 * @modify date 2021-05-05 11:54:21
 * @desc 
 * 1. You are given a string. 
 * 2. You have to print all permutations of the given string iteratively.
 */

public class StringPermutations {

    public static void solution(String s) {
        int len=s.length();

        int tperm=factorial(len);
        for(int num=0;num<tperm;num++){
            StringBuilder ostr=new StringBuilder(s);
            StringBuilder perm=new StringBuilder("");
            int temp=num;

            for(int div=len;div>=1;div--){
                int rem=temp%div;
                temp/=div;

                char ch=ostr.charAt(rem);
                ostr.deleteCharAt(rem);
                perm.append(ch);
            }

            System.out.println(perm);
        }
    }

    public static int factorial(int n) {
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        String s=new String("abc");
        solution(s);
    }
}
