import java.util.ArrayList;

public class StairPaths {

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> bpath = new ArrayList<>();
            bpath.add("");
            return bpath;
        } else if (n < 0) {
            ArrayList<String> bpath = new ArrayList<>();
            return bpath;
        }

        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);

        ArrayList<String> paths = new ArrayList<>();
        for (String path : paths1) {
            paths.add(1 + path);
        }
        for (String path : paths2) {
            paths.add(2 + path);
        }

        return paths;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println((getStairPaths(n)));
    }
}