import java.util.*;

public class Word2 {
    static HashMap<Character, Integer> lastOccurence = new HashMap<>();
    public static void permute(int currChar, String str, Character[] spots) {
        if (currChar == str.length()) {
            for (int i = 0; i < spots.length; i++) {
                System.out.print(spots[i]);
            }
            System.out.println();
            return;
        }
        Character ch = str.charAt(currChar);
        int lo = lastOccurence.get(ch);
        for (int i = lo + 1; i < spots.length; i++) {
            if (spots[i] == null) {
                spots[i] = ch;
                lastOccurence.put(ch, i);
                permute(currChar + 1, str, spots);
                lastOccurence.put(ch, lo);//backtracking step
                spots[i] = null;//backtracking step
            }
        }
    }

    public static void main(String[] args) {
        String str = "aab";

        Character[] spots = new Character[str.length()];

        for (int i = 0; i < str.length(); i++) {
            lastOccurence.put(str.charAt(i), -1);
        }
        permute(0, str, spots);
    }

}