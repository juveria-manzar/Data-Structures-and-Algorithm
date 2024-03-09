/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-29 04:56:31
 * @modify date 2020-12-29 04:56:31
 * @desc Approach:
 *          method uses Memorization Technique (an extension of recursive approach).
            This method is basically an extension to the recursive approach so that we can overcome 
            the problem of calculating redundant cases and thus increased complexity. 
            This method gives an edge over the recursive approach in this aspect.
        Complexity Analysis: 
            Time Complexity: O(N*W). 
                As redundant calculations of states are avoided.
            Auxiliary Space: O(N*W). 
                The use of 2D array data structure for storing intermediate states
 */

public class ZeroOneKnapsackMemoizedSolution {
    
    static int knapsack(int[] wt,int[] val,int W,int n){
        int table[][]=new int[102][1002];
        for (int i = 0; i < n+1; i++) 
            for (int j = 0; j < W + 1; j++) 
                table[i][j] = -1; 
        
        if(n==0||W==0){
            return 0;
        }
        if(table[n][W]!=-1){
            return table[n][W];
        }
        
        if(wt[n-1]>W){
            return table[n][W]=knapsack(wt, val, W, n-1);
        }
        else{
            return table[n][W]=Math.max((val[n-1]+knapsack(wt, val, W-wt[n-1], n-1)),knapsack(wt, val, W, n-1));
        }
        
    }
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W=50;
        int n=wt.length;
        System.out.println(knapsack(wt,val,W,n));
    }
}
