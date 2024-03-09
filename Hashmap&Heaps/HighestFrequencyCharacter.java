
import java.util.*;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(getHighestFrequencyCharacter(str));
    }

    public static char getHighestFrequencyCharacter(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (hm.containsKey(key)) {
                hm.put(key, hm.get(key) + 1);
            } else {
                hm.put(key, 1);
            }
        }

        char higestFrequencyChar = '\0';
        int maxFrequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            int value = hm.get(key);
            if (value > maxFrequency) {
                maxFrequency = value;
                higestFrequencyChar = key;
            }
        }

        return higestFrequencyChar;
    }
}
