public class AllPathsMatrix {

    public static int printTotalPath(int n,int m){
        if(n==1||m==1){
            return 1;
        }

        return printTotalPath(n, m-1)+printTotalPath(n-1, m);
    }
    public static void main(String[] args) {
        int n=4;
        int m=4;
        System.out.println(printTotalPath(n,m));
    }
}
