public class PowerLinear {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x, n-1);
        int xn=xnm1*x;
        return xn;
    }
    public static void main(String[] args) {
        int x=3;
        int n=4;
        int ans=power(x,n);
        System.out.println(ans);
    }
}
