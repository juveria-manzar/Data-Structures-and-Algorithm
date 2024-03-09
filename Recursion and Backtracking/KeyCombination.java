import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-02-24 22:46:50
 * @modify date 2021-02-24 22:46:50
 * @desc 
 */

public class KeyCombination {

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKpc(String str) {

        if(str.length()==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch=str.charAt(0);//6
        String ros=str.substring(1);
        ArrayList<String> rres=getKpc(ros);

        ArrayList<String> mres=new ArrayList<>();

        String codeforch=codes[ch-'0']; //pqrs
        for(int i=0;i<codeforch.length();i++){
            char chcode=codeforch.charAt(i);
            for(String rstr:rres){
                mres.add(chcode+rstr);
            }
        }

        return mres;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        System.out.println(getKpc(str));
    }
}
