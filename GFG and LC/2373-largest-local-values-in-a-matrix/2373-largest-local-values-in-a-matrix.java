// TC: O(9)+ O(n^2)
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j] = getMaxValueAcross3X3Grid(grid, i, j);
            }
        }
        return ans;
    }
    
    private int getMaxValueAcross3X3Grid(int[][] grid, int l, int r){
        int max = 0;
        
        for(int i=l;i<l+3;i++){
            for(int j=r;j<r+3;j++){
                max = Math.max(grid[i][j],max);
            }
        }
        
        return max;
    }
}