/**
 * @author Juveria
 * @create date 2021-06-19 04:49:59
 * @modify date 2021-06-19 04:49:59
 * @desc [description]
 */


import java.util.*;
public class InfixConversion {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String exp=scn.nextLine();
        infixConversion(exp);
    }

    public static void infixConversion(String exp) {
        Stack<Character> operator=new Stack<>();
        Stack<String> postfix=new Stack<>();
        Stack<String> prefix=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }else if((ch<='0'&&ch<='9')||()){}
        }
    }
}
