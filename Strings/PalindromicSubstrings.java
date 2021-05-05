/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-05 07:42:16
 * @modify date 2021-05-05 07:42:16
 * @desc 
 * 1. You are given a string. 
 * 2. You have to print all palindromic substrings of the given string.
 */
public class PalindromicSubstrings {

    public static void solve(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                String sStr=s.substring(i,j);
                
                //if(sStr.equals(new StringBuilder(sStr).reverse().toString()))       
                if(isPalindrome(sStr)){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome=true;
        for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                isPalindrome=false;
                break;
            }
        } 
        return isPalindrome;
    }

    public static void main(String[] args) {
        String s="abbc";
        solve(s);
    }
}
