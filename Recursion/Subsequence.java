/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-20 05:45:23
 * @modify date 2021-02-20 05:45:23
 * @desc [description]
 */
import java.util.ArrayList;

public class Subsequence {
    private static ArrayList<String> getSubsequence(String str) {
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String subS=str.substring(1);
        ArrayList<String> rres=getSubsequence(subS);
        ArrayList<String> mres=new ArrayList<>();
        for(String rstr:rres){
            mres.add(""+rstr);
        }
        for(String rstr:rres){
            mres.add(ch+rstr);
        }
        return mres;
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println(getSubsequence(str));
    }
}
