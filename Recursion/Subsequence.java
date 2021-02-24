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
        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        //bc->[--,-c,b-,bc]
        //abc->[---,--c,-b-,-bc,a--,a-c,ab-,abc]
        char ch=str.charAt(0); //a
        String subS=str.substring(1); //b
        
        ArrayList<String> rres=getSubsequence(subS); //bc->[--,-c,b-,bc]
        
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
