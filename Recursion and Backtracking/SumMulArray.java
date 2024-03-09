import java.util.*;

public class SumMulArray {
    static int findSum(int A[], char op)
    {
        if (A.length == 0 && op=='+')
            return 0;
        else if(A.length == 0 && op=='*'){
            return 1;
        }    
            
        int N=A.length;
        int Arr[]=Arrays.copyOf(A, A.length-1);
        if(op=='+'){
            int sum=findSum(Arr,op)+A[N-1];
            return sum;
        }else{
            int mul=findSum(Arr,op)*A[N-1];
            return mul;
        }
        
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(findSum(arr,'*'));
    }
}