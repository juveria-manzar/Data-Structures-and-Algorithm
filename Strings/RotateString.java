/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-04-11 19:58:10
 * @modify date 2021-04-11 19:58:10
 * @desc Given a string A, rotate the string K times in clockwise direction and return the string.
 */
public class RotateString {
    public static String solve(String s,int k) {
        k=k%s.length();
        // System.out.println(s.substring(0, s.length()-k));
        // System.out.println(s.substring(s.length()-k));
        String ans=s.substring(s.length()-k)+s.substring(0, s.length()-k);
        return ans;
    }
    public static void main(String[] args) {
        String s="juveria";
        int k=1;
        System.out.println(solve(s,k));
    }
}
