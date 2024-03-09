/**
 * @author Juveria-Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2020-12-29 07:44:57
 * @modify date 2020-12-29 07:44:57
 * @desc Approach3:Tabulation: Bottom-Up
 *       Exemptiong Function calls.
 *       Time Complexity: O(N*W). where ‘N’ is the number of weight element and ‘W’ is capacity. As for every weight element we traverse through all weight capacities 1<=w<=W.
        Auxiliary Space: O(N*W). 
        The use of 2-D array of size ‘N*W’.  
 */
public class ZeroOneKnapsackTabulationSolution {
    static int knapsack(int[] wt,int[] val,int W,int n){
        int i,j;
        int K[][] = new int[n + 1][W + 1]; 

        //Bottom-up Manner
        for (i = 0; i < n+1; i++) {
            for (j = 0; j<W+1; j++) {
                if(i==0||j==0){
                    K[i][j]=0;
                }
                else if(wt[i - 1] <= j){
                    K[i][j]=Math.max(val[i - 1]+ K[i - 1][j - wt[i - 1]], K[i - 1][j]); 
                }
                else
                    K[i][j] = K[i - 1][j];
            }
        }
        return K[n][W];
        
    }
    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W=50;
        int n=wt.length;
        System.out.println(knapsack(wt,val,W,n));
    }
}
