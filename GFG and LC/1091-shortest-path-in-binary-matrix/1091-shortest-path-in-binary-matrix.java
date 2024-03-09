class Solution {
    
    private class Point {
        private int x;
        private int y;
        
        Point(){
            
        }
        
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    int[][] dir = {{0, 1}, {1, 1}, {1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length - 1;
        if(grid[0][0]==1 || grid[n][n]==1){
            return -1;
        }
        
        Queue<Point> bfs = new ArrayDeque<>();
        bfs.add(new Point(0,0));
        
        int level = 1; 
        while(bfs.size()>0){
            int size = bfs.size();
            while(size-->0){
                Point head = bfs.remove();
                int x = head.x;
                int y = head.y;
                
                if(x == n && y == n){
                    return level;
                }
                if( x < 0 || y > n || x > n || y< 0 || grid[x][y] >= 1){
                    continue;
                }
                
                grid[x][y] = 2;
                bfs.offer(new Point(x-1, y));
                bfs.offer(new Point(x+1, y));
                bfs.offer(new Point(x, y-1));
                bfs.offer(new Point(x, y+1));


                bfs.offer(new Point(x-1, y-1));
                bfs.offer(new Point(x-1, y+1));
                bfs.offer(new Point(x+1, y-1));
                bfs.offer(new Point(x+1, y+1));
            }
            level++;
        }
        return -1;
    }
}