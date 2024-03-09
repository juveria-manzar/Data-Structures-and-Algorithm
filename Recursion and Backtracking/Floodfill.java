/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-05-17 14:39:21
 * @modify date 2021-05-17 14:39:21
 * @desc
 *       1. You are given a number n, representing the number of rows.
 *       2. You are given a number m, representing the number of columns.
 *       3. You are given n*m numbers, representing elements of 2d array a. The
 *       numbers can be 1 or 0 only.
 *       4. You are standing in the top-left corner and have to reach the
 *       bottom-right corner.
 *       Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd'
 *       (1-step down) 'r' (1-step right).
 *       You can only move to cells which have 0 value in them.
 *       You can't move out of the boundaries or in the cells which have value 1
 *       in them (1 means obstacle)
 */
public class Floodfill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];

        // 0 1 1 0 1
        // 0 0 0 0 0
        // 0 1 1 0 1
        // 0 0 1 0 0
        // 0 0 0 0 0

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean[][] vis = new boolean[n][m];
        floodfill(arr, 0, 0, "", vis);
    }

    public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] vis) {
        if (sr == maze.length - 1 && sc == maze[0].length - 1) {
            System.out.println(asf);
            return;
        }

        if (sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || vis[sr][sc] == true) {
            return;
        }

        vis[sr][sc] = true;

        // top
        floodfill(maze, sr - 1, sc, asf + "t", vis);
        // left
        floodfill(maze, sr, sc - 1, asf + "l", vis);
        // down
        floodfill(maze, sr + 1, sc, asf + "d", vis);
        // right
        floodfill(maze, sr, sc + 1, asf + "r", vis);

        vis[sr][sc] = false;
    }
}
