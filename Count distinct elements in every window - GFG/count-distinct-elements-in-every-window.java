//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        // Add element from 0 to k-1 to map
       for(int i=0;i<k-1;i++){
           fmap.put(arr[i],fmap.getOrDefault(arr[i], 0)+1);
       }
       
       ArrayList<Integer> res =new ArrayList<>();
       for(int i= k-1;i<arr.length;i++){
           // add curr elememt to fmap
           fmap.put(arr[i], fmap.getOrDefault(arr[i],0) + 1);
           
           // add curr size of hashmap
           res.add(fmap.size());
           
           // reduce freq of first elemnt of window; if 0 then remove it
           int oldFr = fmap.get(arr[i-k+1]);
           if(oldFr ==1){
               fmap.remove(arr[i-k+1]);
           }else{
               fmap.put(arr[i-k+1],oldFr-1);
           }
       }
       
       return res;
    }
}

