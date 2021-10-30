import java.util.ArrayDeque;

class Solution {
    public static class Pair{
        int i;
        int j;
        
        Pair(){}
        
        Pair(int i, int j){
            this.i=i;
            this.j=j;
        }
        
    }
    public int maxDistance(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans=-1;
        ArrayDeque<Pair> q=new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                     mat[i][j] = 0;
                    q.add(new Pair(i,j));
                }else{
                    mat[i][j] = -1;
                }
            }
        }
        
        int[][] dir={{-1,0},{0,-1},{1,0},{0,1}};
        
        //bfs
        while(q.size()>0){
            Pair rem=q.remove();
            
            for(int k=0;k<4;k++){
                int ni=rem.i+dir[k][0];
                int nj=rem.j+dir[k][1];
                
                if(ni>=0&& nj>=0&& ni<n&&nj<m&&mat[ni][nj]==-1){
                    mat[ni][nj]  = mat[rem.i][rem.j] + 1;
                    ans = mat[ni][nj];
                    q.add(new Pair(ni,nj));
                }
            }
            
        }
    
        return ans;
    }
}