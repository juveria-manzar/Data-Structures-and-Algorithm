import java.io.*;
import java.util.*;

public class EvenOdd {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        while(t!=0){
            String str=scan.nextLine();
            // System.out.println(str);
            char[] s=str.toCharArray();
            String even="";
            String odd="";
            for(int i=0;i<s.length;i++){
                if(i%2==0){
                    even+=s[i];
                }
                else{
                    odd+=s[i];
                }
            }
            System.out.println(even+" "+odd);
            t--;
        }
        
    }
}