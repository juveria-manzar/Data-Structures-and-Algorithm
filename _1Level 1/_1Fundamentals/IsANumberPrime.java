import java.util.*;
public class IsANumberPrime{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long testCases=in.nextLong(); //5

        for(int i=0;i<testCases;i++){
            // System.out.println(testCases);
            int num=in.nextInt();
            // System.out.println(num);
            int count=0;
            //for if the square root of a number is not divisible by the number then the number is prime!
            for(int div=2;div*div<=num;div++){
                if(num%div==0){
                    count++;
                    // as soon as we find it to be divisble by one number that means it's not prime.
                    break;
                }
            }
            if(count==1){
                    System.out.println("not prime");
                }
            else{
                System.out.println("prime");
            }
        }
        in.close();
    }
}