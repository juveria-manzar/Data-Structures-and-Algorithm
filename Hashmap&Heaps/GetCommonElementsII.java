import java.util.*;

public class GetCommonElementsII {
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

        getCommonElementsII(arr1, arr2);
    }

    public static void getCommonElementsII(int[] a1, int[] a2) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int key : a1) {
            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }

        for (int key : a2) {
            if (hm.containsKey(key) && hm.get(key) > 0) {
                hm.put(key, hm.get(key) - 1);
                System.out.println(key);
            }
        }
    }
}
