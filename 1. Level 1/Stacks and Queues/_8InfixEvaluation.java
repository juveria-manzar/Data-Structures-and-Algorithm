/**
 * @author Juveria
 * @create date 2021-06-19 03:52:04
 * @desc [description]
 */

import java.util.*;

public class _8InfixEvaluation {

    public static int evaluateExpression(String exp){
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }else if(ch>='0'&&ch <='9'){
                operand.push(ch-'0');
            }
            else if(ch==')'){
                //evaluate till you find an opening bracket
                while(operator.peek()!='('){
                    char opr=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();

                    int val=calculate(a,b,opr);
                    operand.push(val);
                }
                operator.pop(); //'('
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operator.size()>0 && operator.peek()!='(' && priority(ch)<=priority(operator.peek())){
                    char opr=operator.pop();
                    int b=operand.pop();
                    int a=operand.pop();
                    int val=calculate(a,b,opr);
                    operand.push(val);
                }
                operator.push(ch);
            }
        }

        while(operator.size()>0){
            char opr=operator.pop();
            int b=operand.pop();
            int a=operand.pop();
            int val=calculate(a,b,opr);
            operand.push(val);
        }

        return operand.peek();
    }

    public static int calculate(int a,int b,char opr){
        if(opr=='+'){
            return a+b;
        }else if(opr=='-'){
            return a-b;
        }
        else if(opr=='*'){
            return a*b;
        }
        else{
            return a/b;
        }
    }

    public static int priority(char opr){
        if(opr=='+'||opr=='-'){
            return 1;
        }
        else{
            return 2;
        }
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String exp=scn.nextLine();

        int val=evaluateExpression(exp);
        System.out.println(val);
    }
}
