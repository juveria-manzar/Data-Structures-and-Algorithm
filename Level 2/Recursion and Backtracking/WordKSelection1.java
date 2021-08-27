import java.util.HashSet;

public class WordKSelection1 {

    public static void combination(int currIdx, String ustr,int selectedSoFar, String ansSoFar,int k) {
        if(currIdx==ustr.length()){
            if(selectedSoFar==k){
                System.out.println(ansSoFar);
            }
            return;
        }
        char ch=ustr.charAt(currIdx);
        combination(currIdx+1, ustr, selectedSoFar+1,ansSoFar+ch, k);
        combination(currIdx+1, ustr, selectedSoFar,ansSoFar, k);    
    }
    public static void main(String[] args) {
        String str="aabbbccdde";
        int k=3;

        String uniqueStr="";
        HashSet<Character> unique=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!unique.contains(str.charAt(i))){
                unique.add(str.charAt(i));
                uniqueStr+=str.charAt(i);
            }    
        }

        //level->characters
        //indexofCurrChar,str,selectedSoFar,ansSoFar,totalSelection
        combination(0,uniqueStr,0,"",k);
    }
}
