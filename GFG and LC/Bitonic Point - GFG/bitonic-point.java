//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    
    private static boolean isSortedArray(int[] array, int n){
        if(n == 1 || n == 0) return true;
        return array[n-2] <= array[n-1] && isSortedArray(array, n-1);
    }
    
    int findMaximum(int[] arr, int n) {
        // code here
        if(isSortedArray(arr, n)){
            return arr[n-1];
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return arr[i-1];
            }
        }
        
        return -1;
    }
}