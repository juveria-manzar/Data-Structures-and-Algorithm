import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        HashMap<String, String> map = new HashMap<>(); // emp vs managers
        String ceo = "";

        while (n-- > 0) {
            String emp = scn.next();
            String man = scn.next();

            map.put(emp, man);
        }

        HashMap<String, ArrayList<String>> gtree = new HashMap<>(); // managers vs direct emp under manager

        for (String emp : map.keySet()) {
            String man = map.get(emp);

            if (man.equals(emp)) {
                ceo = man;
                if (gtree.containsKey(man) == false) {
                    gtree.put(emp, new ArrayList<>());
                }
                continue;
            }

            if (gtree.containsKey(emp) == false) {
                gtree.put(emp, new ArrayList<>());
            }

            ArrayList<String> list = gtree.getOrDefault(man, new ArrayList<>());
            list.add(emp);
            gtree.put(man, list);
        }

        HashMap<String, Integer> res = new HashMap<>();
        getSize(ceo, gtree, res);

        for (String man : res.keySet()) {
            int empc = res.get(man);
            System.out.println(man + " " + empc);
        }
    }

    public static int getSize(String root, HashMap<String, ArrayList<String>> gtree, HashMap<String, Integer> res) {
        int s = 0;

        for (String child : gtree.get(root)) {
            s += getSize(child, gtree, res);
        }
        res.put(root, s);
        return s + 1;
    }

}