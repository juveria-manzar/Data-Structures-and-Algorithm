import java.util.*;
    public class DigitsOfAN{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;

        int nod=0;
        while(temp!=0){
            temp=temp/10;
            nod++;
        }
        int div=(int)Math.pow(10,nod-1);
        while(div!= 0){
            int q=n/div;
            System.out.println(q);
            
            n=n%div;
            div=div/10;
        }
        in.close();
    }
}