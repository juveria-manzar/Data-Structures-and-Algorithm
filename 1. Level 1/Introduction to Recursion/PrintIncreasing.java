public class PrintIncreasing {
    private static void printIncreasing(int x){
        if(x>0){
            printIncreasing(x-1);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int n=5;
        printIncreasing(n);
    }
}
