//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    private static boolean isBurdenPossible(int[] arr, int burden, int m){
        int student=1;
        int sum=0;
        for(int n:arr){
            sum+=n;
            if(sum>burden){
                student++;
                sum=n;
            }
        }
        return student<=m;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(M>N)return -1;
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int n: A){
            sum+=n;
            max = Math.max(max, n);
        }
        
        int lo = max;
        int hi = sum;
        int burden = max;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isBurdenPossible(A, mid, M)){
                burden = mid;
                hi = mid-1;
            }else{
                lo=mid+1;
            }
        }
        return burden;
    }
};