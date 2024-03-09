import java.util.ArrayList;
import java.util.Scanner;

public class MazePathsWithJump {
    public static ArrayList<String> getMazePathsJump(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        // for horizontal moves
        for (int h = 1; h <= dc - sc; h++) {
            ArrayList<String> hpaths = getMazePathsJump(sr, sc + h, dr, dc);

            for (String hpath : hpaths) {
                paths.add("h" + h + hpath);
            }
        }

        // for vertical moves
        for (int v = 1; v <= dr - sr; v++) {
            ArrayList<String> vpaths = getMazePathsJump(sr + v, sc, dr, dc);

            for (String vpath : vpaths) {
                paths.add("v" + v + vpath);
            }
        }

        // for diagonal moves
        for (int d = 1; d <= dr - sr && d < dc - sc; d++) {
            ArrayList<String> dpaths = getMazePathsJump(sr + d, sc + d, dr, dc);

            for (String dpath : dpaths) {
                paths.add("d" + d + dpath);
            }
        }
        return paths;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = getMazePathsJump(1, 1, n, m);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
