
/**
 * @author [Juveria]
 * @email [juveriamanzar29@gmail.com]
 * @create date 2021-08-22 13:36:18
 * @modify date 2021-08-22 13:36:18
 * @desc approach permutation 2
 */

import java.util.*;

public class Words1 {

    public static void permutations(int N, HashMap<Character, Integer> fmap, int currentSpot, String asf) {

        if (currentSpot > N) {
            System.out.println(asf);
            return;
        }
        
        for (char ch : fmap.keySet()) {
            if (fmap.get(ch) > 0) {
                fmap.put(ch, fmap.get(ch) - 1);
                permutations(N, fmap, currentSpot + 1, asf + ch);
                fmap.put(ch, fmap.get(ch) + 1);// backtracking
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabb";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }
        // permutation(noOfSlots,Fmap,currSlot,ansSoFar)
        permutations(str.length(), frequencyMap, 1, "");
    }
}
