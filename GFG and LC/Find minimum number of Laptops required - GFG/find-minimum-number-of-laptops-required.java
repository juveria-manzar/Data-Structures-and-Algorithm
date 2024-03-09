//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int i = 0;
            int N = Integer.parseInt(br.readLine().trim());

            int start[] = new int[N];
            int end[] = new int[N];

            String inputLine2[] = br.readLine().trim().split(" ");
            String inputLine3[] = br.readLine().trim().split(" ");
            
            for (i = 0; i < N; i++) {
                start[i] = Integer.parseInt(inputLine2[i]);
                end[i] = Integer.parseInt(inputLine3[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.minLaptops(N, start, end));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        TreeMap<Integer, Integer> map =new TreeMap<>();
        
        for(int i=0;i<N;i++){
            map.put(start[i], map.getOrDefault(start[i],0)+1);
            map.put(end[i], map.getOrDefault(end[i],0)-1);
        }
        
        // return map.lastKey();

        int sum =0, max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            sum+=entry.getValue();
            max =Math.max(sum, max);
        }
        
        return max;
    }
}