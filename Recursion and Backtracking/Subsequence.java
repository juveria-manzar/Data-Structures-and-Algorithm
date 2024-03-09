
/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-20 05:45:23
 * @modify date 2021-02-20 05:45:23
 * @desc n-> 2^n combinations
 */
import java.util.ArrayList;

public class Subsequence {
    private static ArrayList<String> getSubsequence(String str) {

        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char currChar = str.charAt(0);
        String subStr = str.substring(1);
        ArrayList<String> mres = getSubsequence(subStr);

        ArrayList<String> res = new ArrayList<>();

        for (String s : mres) {
            res.add("" + s);
        }
        for (String s : mres) {
            res.add(currChar + s);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(getSubsequence(str));
    }
}
