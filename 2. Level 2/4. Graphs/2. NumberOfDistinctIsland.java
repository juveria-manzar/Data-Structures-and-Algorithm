public class Solution {
    /**
     * @param grid: a list of lists of integers
     * @return: return an integer, denote the number of distinct islands
     */
    static String comp="";
    public int numberofDistinctIslands(int[][] grid) {
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    comp="";
                    dfs(i,j,grid);
                    set.add(comp);
                }
            }
        }

        return set.size();
    }

    public void dfs(int i,int j, int[][] grid){
        grid[i][j]=0;

        if(i-1>=0&&grid[i-1][j]==1){
            comp+='t';
            dfs(i-1,j,grid);
        }

        if(i+1<grid.length&&grid[i+1][j]==1){
            comp+='d';
            dfs(i+1,j,grid);
        }

        if(j-1>=0&&grid[i][j-1]==1){
            comp+='l';
            dfs(i,j-1,grid);
        }

        if(j+1<grid[0].length&&grid[i][j+1]==1){
            comp+='r';
            dfs(i,j+1,grid);
        }

        comp+='z';
    }
}