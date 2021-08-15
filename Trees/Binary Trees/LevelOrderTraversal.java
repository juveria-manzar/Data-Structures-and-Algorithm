import java.util.*;

public class LevelOrderTraversal {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = hm.get(s.charAt(i));
            if (i != s.length() - 1 && hm.get(s.charAt(i))<hm.get(s.charAt(i + 1))) {
                System.out.println(value);
                int valueNext = hm.get(s.charAt(i + 1));
                ans += valueNext - value;
                i++;
            }else {
                ans += value;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        if (Integer.MAX_VALUE > a || a < Integer.MIN_VALUE) {

        }
        System.out.println(romanToInt("III"));
    }
}
