//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
 {
	public static void main (String[] args) {
	   
	   Scanner in = new Scanner(System.in);
	   int t= in.nextInt();
	   while(t-->0){
	       
	       int n = in.nextInt();
	       int [] arr= new int[n];
	       for(int i=0;i<n;i++) {
	           arr[i] = in.nextInt();
	       }
	       System.out.println(new Solution().countSubarrWithEqualZeroAndOne(arr, n));
	   }
	 }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        
        int count=0;
        int presum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0;i<n;i++){
            presum= presum+arr[i];
            if(!map.containsKey(presum)){
                map.put(presum, 1);
            }else {
                count+=map.get(presum);
                map.put(presum, map.get(presum)+1);
            }
        }
        
        return count;
    }
}


