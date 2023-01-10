//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().distinctCount(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    int distinctCount(int[] arr, int n) {
        int left = 0;
        int right = n-1;
        
        int prev = Integer.MIN_VALUE;
        int next = Integer.MAX_VALUE;
        
        int count =0;
        
        while(left<=right){
            
            int leftVal= Math.abs(arr[left]);
            int rightVal = Math.abs(arr[right]);
            
            if(leftVal == rightVal){
                if(leftVal!=prev && rightVal!=next){
                    count++;
                }
                prev= leftVal;
                next=rightVal;
                left++;
                right--;
            }else if(leftVal>rightVal){
                if(leftVal!=prev){
                    count++;
                }
                prev = leftVal;
                left++;
            }else{
                if(rightVal!=next){
                    count++;
                }
                next = rightVal;
                right--;
                
            }
        }
        return count;
    }
}
