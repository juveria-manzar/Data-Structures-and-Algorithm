/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-06-23 08:16:52
 * @modify date 2021-06-23 08:16:52
 * @desc https://www.pepcoding.com/resources/online-java-foundation/stacks-and-queues/sliding-window=maximum-official/ojquestion
 */

import java.io.*;
import java.util.*;

public class _6SlidingWindowMaximum {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();

        // code
        slidingWindowMax(arr, k);
    }

    public static void slidingWindowMax(int[] arr, int k) {
        int n=arr.length;
        int[] nextGreaterRight=nextGreaterRight(arr);
        int j=0;

        for(int i=0;i<=n-k;i++){

            if(i>j){
                j=i;
            }
            
            while(nextGreaterRight[j]<i+k){
                j=nextGreaterRight[j];
            }
            System.out.println(arr[j]);
        }
    }

    public static int[] nextGreaterRight(int[] arr) {
        int n=arr.length;
        int[] ngr=new int[n];
        Stack<Integer> st=new Stack<>();

        ngr[n-1]=n;
        st.push(n-1);
        
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]<=arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ngr[i]=n;
            }else{
                ngr[i]=st.peek();
            }

            st.push(i);
        }
        return ngr;
    }

}