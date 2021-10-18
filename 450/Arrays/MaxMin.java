import java.util.*;

public class MaxMin {

    public static class Pair {
        int max;
        int min;

        Pair() {
        }
    }

    public static Pair maxMin(int[] arr, int lo, int hi) {

        Pair maxMin = new Pair();
        Pair maxMinL = new Pair();
        Pair maxMinR = new Pair();
        int mid;

        if (lo == hi) {
            maxMin.max = arr[lo];
            maxMin.min = arr[lo];
            return maxMin;
        }
        if (hi == lo + 1) {
            if (arr[lo] > arr[hi]) {
                maxMin.max = arr[lo];
                maxMin.min = arr[hi];
            } else {
                maxMin.max = arr[hi];
                maxMin.min = arr[lo];
            }
            return maxMin;
        }
        mid = (lo + hi) / 2;
        maxMinL = maxMin(arr, lo, mid);
        maxMinR = maxMin(arr, mid + 1, hi);

        maxMin.min = Math.min(maxMinL.min, maxMinR.min);
        maxMin.max = Math.max(maxMinL.max, maxMinR.max);

        return maxMin;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Pair pr = maxMin(arr, 0, arr.length - 1);

        System.out.println(pr.max + " " + pr.min);
    }
}
