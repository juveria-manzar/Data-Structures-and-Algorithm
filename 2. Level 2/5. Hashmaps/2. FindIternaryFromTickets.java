import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noofpairs_src_des = scn.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < noofpairs_src_des; i++) {
            String s1 = scn.next();
            String s2 = scn.next();
            map.put(s1, s2);
        }

        HashMap<String, Boolean> ll = new HashMap<>(); // linkedList

        for (String src : map.keySet()) {

            String dest = map.get(src);

            if (ll.containsKey(src) == false) {
                ll.put(src, true);
            } else {
                ll.put(src, ll.get(src));
            }

            ll.put(dest, false);
        }

        String src = "";

        for (String key : ll.keySet()) {
            if (ll.get(key) == true) {
                src = key;
                break;
            }
        }

        // print the journey

        while (map.containsKey(src) == true) {
            System.out.print(src + "->");
            src = map.get(src);
        }

        System.out.println(src + ".");
    }
}
