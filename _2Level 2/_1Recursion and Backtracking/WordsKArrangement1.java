import java.io.*;
import java.util.*;

public class WordsKArrangement1 {
    
    public static void permute(String ustr,char[] slots,int ts,int cc,int ssf){
        if(cc==ustr.length()){
            if(ssf==ts){
                for(int i=0;i<slots.length;i++){
                    System.out.print(slots[i]);
                }
                System.out.println();
            }
            return;
        }
        
        
        char ch=ustr.charAt(cc);
        
        for(int i=0;i<slots.length;i++){
            if(slots[i]=='0'){
                slots[i]=ch;
                permute(ustr,slots,ts,cc+1,ssf+1);
                slots[i]='0';
            }
        }
        
        permute(ustr,slots,ts,cc+1,ssf);
        
    }
 

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int k = Integer.parseInt(br.readLine());

    HashSet<Character> unique = new HashSet<>();
    String ustr = "";
    for (char ch : str.toCharArray()) {
      if (unique.contains(ch) == false) {
        unique.add(ch);
        ustr += ch;
      }
    }
    
    char[] slots=new char[k];
    Arrays.fill(slots,'0');
    
    //string,slots,ts,currSLot,selected so far
    permute(ustr,slots,k,0,0);
    
  }

}