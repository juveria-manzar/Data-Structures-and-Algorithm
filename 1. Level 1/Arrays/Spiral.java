import java.io.*;
import java.util.*;

public class Spiral {

    public static boolean isInBounds(int i, int j,int n) {
        if (i < 0 || i >= n || j < 0 || j >= n)
            return false;
        return true;
    }

    public static String[][] oneDto2D(String[] arr) {

        int check = (int) Math.round(Math.sqrt(arr.length));
        String[][] mat = new String[check][check];
        int count = 0;
        for (int i = 0; i < check; i++) {
            for (int j = 0; j < check; j++) {
                mat[i][j] = arr[count];
                count++;
            }
        }
        return mat;
    }

    // check if the position is blocked
    public static boolean isBlocked(String[][] matrix, int i, int j) {
        if (!isInBounds(i, j,matrix.length))
            return true;
        if (matrix[i][j] == "")
            return true;
        return false;
    }

    // DFS code to traverse spirally
    public static void spirallyDFSTravserse(String[][] matrix, int i, int j, int dir, LinkedList<String> res) {
        if (isBlocked(matrix, i, j) == true)
            return;
        boolean allBlocked = true;
        for (int k = -1; k <= 1; k += 2) {
            allBlocked = allBlocked && isBlocked(matrix, k + i, j) && isBlocked(matrix, i, j + k);
        }
        res.add(matrix[i][j]);
        matrix[i][j] = "";
        if (allBlocked) {
            return;
        }

        // dir: 0 - right, 1 - down, 2 - left, 3 - up
        int nxt_i = i;
        int nxt_j = j;
        int nxt_dir = dir;
        if (dir == 0) {
            if (!isBlocked(matrix, i, j + 1)) {
                nxt_j++;
            } else {
                nxt_dir = 1;
                nxt_i++;
            }
        } else if (dir == 1) {
            if (!isBlocked(matrix, i + 1, j)) {
                nxt_i++;
            } else {
                nxt_dir = 2;
                nxt_j--;
            }
        } else if (dir == 2) {
            if (!isBlocked(matrix, i, j - 1)) {
                nxt_j--;
            } else {
                nxt_dir = 3;
                nxt_i--;
            }
        } else if (dir == 3) {
            if (!isBlocked(matrix, i - 1, j)) {
                nxt_i--;
            } else {
                nxt_dir = 0;
                nxt_j++;
            }
        }
        spirallyDFSTravserse(matrix, nxt_i, nxt_j, nxt_dir, res);
    }

    // to traverse spirally
    public static LinkedList<String> spirallyTraverse(String[][] matrix) {
        LinkedList<String> res = new LinkedList<String>();
        spirallyDFSTravserse(matrix, 0, 0, 0, res);
        return res;
    }

    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        String[] arr = ip.split(", ");

        String[][] mat = oneDto2D(arr);
        // Function Call
        LinkedList<String> res = spirallyTraverse(mat);
        int size = mat.length;
        LinkedList<LinkedList<String>> ans = new LinkedList<>();
        for (int i = 0; i < size; ++i)
            ans.add(new LinkedList<>());
        int count = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < mat[0].length; j++) {
                ans.get(i).add(res.get(count));
                count++;
            }
        }
        System.out.print(ans);
    }
}