public class PrintDecreasing {
    public static void printSeries(int n){
        if(n!=0){
            System.out.println(n);
            printSeries(n-1);
        }
    }
 public static void main(String[] args) {
     int n=6;
    //  System.out.println(n);
     printSeries(n);
 }   
}
