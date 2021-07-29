import java.util.*;

public class GetCommonElementsI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        getCommonElementsI(arr1, arr2);
    }

    public static void getCommonElementsI(int[] a1, int[] a2) {
        HashSet<Integer> hs = new HashSet<>();

        for (int key : a1) {
            hs.add(key);
        }

        for (int key : a2) {
            if (hs.contains(key)) {
                System.out.println(key);
                hs.remove(key);
            }
        }
    }
}
