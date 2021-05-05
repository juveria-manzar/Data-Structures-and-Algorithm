/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-05 10:10:23
 * @modify date 2021-05-05 10:10:23
 * @desc 
 * 1. You are given a string. 
 * 2. You have to compress the given string in the following two ways - 
 * First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
 * For "aaabbccdee", the compressed string will be "abcde".
 * Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
 * For "aaabbccdee", the compressed string will be "a3b2c2de2".
 */

public class StringCompression{

    public static String compress1(String s){
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1))
                ans+=s.charAt(i);
        }
        return ans+s.charAt(s.length()-1);
    }

    public static String compress2(String s){
        String ans="";
        int count=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                if(count!=1){
                    ans+=s.charAt(i)+Integer.toString(count);
                }
                else{
                    ans+=s.charAt(i);
                }
                count=1;
            }else{
                count++;
            }
        }
        if(count>1){
            ans+=s.charAt(s.length()-1)+Integer.toString(count);
        }else
             ans+=s.charAt(s.length()-1);
        return ans;
    }
    public static void main(String[] args) {
        String s="wwwwaaadexxxxxx";
        System.out.println(compress1(s));
        System.out.println(compress2(s));
    }
}