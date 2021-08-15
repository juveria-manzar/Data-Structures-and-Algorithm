public class PrintIncDec {
    public static void printSeries(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        printSeries(a-1);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int n=6;
        printSeries(n);  
    }
}
