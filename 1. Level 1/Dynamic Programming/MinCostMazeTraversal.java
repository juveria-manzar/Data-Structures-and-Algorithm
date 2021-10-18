/**
 * @author [author]
 * @email [example@mail.com]
 * @create date 2021-06-16 01:49:05
 * @modify date 2021-06-16 01:49:05
 * @desc https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/min-cost-maze-traversal-official/ojquestion
 * all three approaches of the problem
 * recursive, memoized, tabulated
 */
import java.util.*;

public class MinCostMazeTraversal {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();

        int[][] mazeCost=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mazeCost[i][j]=scn.nextInt();
            }
        }

        // System.out.println(minCost(mazeCost,0,0,n-1,m-1));

        // int[][] qb=new int[n][m];
        // System.out.println(minCost_memoized(mazeCost,0,0,n-1,m-1,qb));

        System.out.println(minCost_tabulation(mazeCost));

    }    

    public static int minCost(int[][] cost,int sr,int sc,int dr,int dc) {
        if(sr==dr && sc==dc){
            return cost[sr][sc]; //source and dest same. atleast resturn the cost of dest. 
        }

        if(sr>dr || sc>dc){
            return Integer.MAX_VALUE; //if source doesnt exist return a large value that can never be the minCost
        }

        int hnc=minCost(cost,sr,sc+1,dr,dc); //horizontal neihbour to dest minCost
        int vnc=minCost(cost,sr+1,sc,dr,dc); //vertical neighbour to dest minCost

        int stodmc=Math.min(hnc,vnc)+cost[sr][sc];

        return stodmc;

    }

    public static int minCost_memoized(int[][] cost,int sr,int sc,int dr,int dc,int[][] qb) {
        if(sr==dr && sc==dc){
            return cost[sr][sc]; //source and dest same. atleast resturn the cost of dest. 
        }

        if(sr>dr || sc>dc){
            return Integer.MAX_VALUE; //if source doesnt exist return a large value that can never be the minCost
        }

        if(qb[sr][sc]!=0){
            return qb[sr][sc];
        }
        int hnc=minCost(cost,sr,sc+1,dr,dc); //horizontal neihbour to dest minCost
        int vnc=minCost(cost,sr+1,sc,dr,dc); //vertical neighbour to dest minCost

        int stodmc=Math.min(hnc,vnc)+cost[sr][sc];
        qb[sr][sc]=stodmc;

        return qb[sr][sc];
    }

    public static int minCost_tabulation(int[][] cost){
        int n=cost.length;
        int m=cost[0].length;

        int[][] dp=new int[n][m];

        //dp[i][j]-> stores min cost of i,j to dest

        //smallest problem -> dp[n-1][m-1]

        //travel from smallest to largest problem
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                
                if(i==n-1 && j==m-1){
                    dp[i][j]=cost[n-1][m-1];
                }
                //no vertical nbr
                else if(i==n-1){
                    dp[i][j]=dp[i][j+1]+cost[i][j];
                }

                // no horizontol nbr
                else if(j==m-1){
                    dp[i][j]=dp[i+1][j]+cost[i][j];
                }
                else{
                    dp[i][j]=Math.min(dp[i][j+1],dp[i+1][j])+cost[i][j];
                }
            }
        }

        return dp[0][0];
    }
}
