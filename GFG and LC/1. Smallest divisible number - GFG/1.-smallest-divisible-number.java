// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Solution g=new Solution();
            System.out.println(g.getSmallestDivNum(n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static long gcd(long a, long b)
    {
        if(a%b != 0)
            return gcd(b,a%b);
        else
            return b;
    }
    public static long getSmallestDivNum(int n){
        // code here
        long ans=1;
        for(long i=1;i<=n;i++){
            ans=(ans*i)/gcd(ans, i);
        }
        return ans;
    }
}
