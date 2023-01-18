//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        long count = 0;
        
        long presum = 0;
        HashMap<Long, Long> map = new HashMap<>();
        map.put(new Long(0), new Long(1)); //since sum == 0 for index -1;
        
        long ans =0;
        for(int i=0;i<n;i++){
            long val = arr[i];
            presum+=val;
            if(map.containsKey(presum)){
                ans+= map.get(presum);
                map.put(presum, map.get(presum)+1);
            }else{
                map.put(presum, new Long(1));
            }
        }
        return ans;
        
        
    }
}