public class PowerLinear {
    public static int power(int m,int n){
        if(n==0){
            return 1;
        }
        else{
            return power(m, n-1)*m;
        }
    }
    public static void main(String[] args) {
        int m=0;
        int n=5;
        System.out.println(power(m,n));
    }
}
