//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int phy[] = new int[n];
    		int chem[] = new int[n];
    		int math[] = new int[n];
            
            for (int i = 0; i < n; ++i)
                {
                    phy[i]=sc.nextInt();
                    chem[i]=sc.nextInt();
                    math[i]=sc.nextInt();
                }
		    
		    Solution ob = new Solution();
		    
		    ob.customSort (phy, chem, math, n);
    		for (int i = 0; i < n; ++i)
    			System.out.println(phy[i]+" " + chem[i] + " " + math[i]);

        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static class Students implements Comparable<Students>{
        int phy;
        int chem;
        int maths;
        
        public Students(int phy, int chem, int maths){
            this.phy= phy;
            this.chem=chem;
            this.maths=maths;
        }
        
        public int compareTo(Students o){
            if(this.phy==o.phy){
                if(this.chem==o.chem){
                    return this.maths-o.maths;
                }
                else{
                    return o.chem-this.chem;
                }
            }else{
                return this.phy-o.phy;
                
            }
        }
    }
    public void customSort (int phy[], int chem[], int math[], int N)
    {
        Students[] students = new Students[N];
        for(int i=0;i<phy.length;i++){
            students[i]= new Students(phy[i], chem[i], math[i]);
        }
        
        Arrays.sort(students);
        for(int i=0;i<N;i++){
            phy[i] =students[i].phy;
            chem[i] =students[i].chem;
            math[i] =students[i].maths;
        }
    }
}
