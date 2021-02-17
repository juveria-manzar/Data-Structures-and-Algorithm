public class Factorial {
    private static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return printFactorial(n-1)*n;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(printFactorial(n)); 
    }
}
