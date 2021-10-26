class Solution {
    
    
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ++count;
                    dfsPath(i,j,grid);
                }
            }
        }
        return count;
    }
    
    
    public void dfsPath(int i,int j, char[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        
        if(i<0||j<0||i>=n||j>=m||grid[i][j]=='0') 
        {return;
        }
        
        grid[i][j]='0';
        dfsPath(i-1,j,grid);
        dfsPath(i+1,j,grid);
        dfsPath(i,j+1,grid);
        dfsPath(i,j-1,grid);
    }
}