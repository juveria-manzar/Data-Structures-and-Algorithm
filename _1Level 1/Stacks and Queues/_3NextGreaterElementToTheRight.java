/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-06-23 08:07:32
 * @modify date 2021-06-23 08:07:32
 * @desc https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/next-greater-element-official/ojquestion
 */


import java.io.*;
import java.util.*;

public class _3NextGreaterElementToTheRight{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "");
    }
    System.out.println(sb);
}

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
 }

 public static int[] solve(int[] arr){
    int n=arr.length; 
    Stack<Integer> st=new Stack<>();
    int[] ngor=new int[n];
    ngor[n-1]=-1;
    st.push(arr[n-1]);
    for(int i=n-2;i>=0;i--){
        while(st.size()>0 && st.peek()<=arr[i] ){
            st.pop();
        }
        if(st.size()==0){
            ngor[i]=-1;
        }else{
            ngor[i]=st.peek();
        }
        st.push(arr[i]);
    }
   return ngor;
 }

}