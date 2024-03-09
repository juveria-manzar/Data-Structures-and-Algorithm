import java.io.*;
import java.util.*;

class NumberOfIslands {
    
    public static int numberOfIsland(int[][] grid){
        int n=grid.length;
        int m= grid[0].length;
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    getConnectedComps(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static void getConnectedComps(int[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]!=0){
            return;
        }
        grid[i][j]=1;
        
        getConnectedComps(grid, i-1,j);
        getConnectedComps(grid, i,j+1);
        getConnectedComps(grid, i+1,j);
        getConnectedComps(grid, i,j-1);
    }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }
 
      System.out.println(numberOfIsland(arr));
   }

}