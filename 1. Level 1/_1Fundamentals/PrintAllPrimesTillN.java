/**
 * @author Juveria Manzar
 * @email juveriamanzar29@gmail.com
 * @create date 2021-03-13 18:18:55
 * @modify date 2021-03-13 18:18:55
 * @desc Two methods
 *          brute force
 *          seive of erthoses
 *  Level: Medium
 * Time Complexity: n*log(log(n))
 */
import java.util.*;
public class PrintAllPrimesTillN{

    //method1
    static void printPrimes1(int low, int high){
        for(int i=low;i<=high;i++){
            int count=0;
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }
        }
    }

    //method2
    static void printPrimes2(int high){
        boolean[] prime=new boolean[high+1];

        for(int i=0;i<prime.length;i++){
            prime[i]=true;
        }

        for(int p=2;p*p<=high;p++){
            if(prime[p]==true){
                for(int i=2*p;i<=high;i+=p){
                    prime[i]=false;
                }
            }
        }

        for(int p=2;p<=high;p++){
            if(prime[p]==true){
                System.out.print(p+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low= scn.nextInt();
        int high= scn.nextInt();
        scn.close();
        printPrimes1(low,high);
        printPrimes2(high);
    }
}