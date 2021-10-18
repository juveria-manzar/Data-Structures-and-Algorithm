/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-29 04:45:02
 * @modify date 2020-12-29 04:45:02
 * @desc Complexity Analysis: 
 *          A Naive recursive implementation of 0-1 Knapsack problem
 *          Time Complexity: O(2n). As there are redundant subproblems.
            Auxiliary Space :O(1). 
            As no extra data structure has been used for storing values.
 */
public class ZeroOneKnapsackProblem {
    static int knapsack(int[] wt,int[] val,int W,int n){
        if(n==0||W==0){
            return 0;
        }
        if(wt[n-1]>W){
            return knapsack(wt, val, W, n-1);
        }
        else{
            return Math.max((val[n-1]+knapsack(wt, val, W-wt[n-1], n-1)),knapsack(wt, val, W, n-1));
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
