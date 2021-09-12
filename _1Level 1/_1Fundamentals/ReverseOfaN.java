import java.util.*;
    public class ReverseOfaN{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int digit=0;
        while(n!=0){
            digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
        in.close();
    }
}
