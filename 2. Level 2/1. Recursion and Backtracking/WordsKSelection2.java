import java.util.HashSet;

public class WordsKSelection2 {

    public static void combinations(String ustr, int totalSlots, int currSlot, String ansSoFar, int lastCharSelected) {

        if (currSlot > totalSlots) {
            System.out.println(ansSoFar);
            return;
        }
        for (int i = lastCharSelected; i < ustr.length(); i++) {
            char ch = ustr.charAt(i);
            combinations(ustr, totalSlots, currSlot + 1, ansSoFar + ch, i);
        }
    }

    public static void main(String[] args) {
        String str = "aabbbccdde";
        int k = 3;

        String uString = "";
        HashSet<Character> unique = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!unique.contains(ch)) {
                uString += ch;
                unique.add(ch);
            }
        }

        combinations(uString, k, 1, "", -1);
    }
}
