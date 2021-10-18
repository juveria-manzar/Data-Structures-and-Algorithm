public class PrintNumbersOfNDigits2 {
    public static void printAll(int currIndex,int N, int[] digits,int[] arr){
        if(currIndex==N){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return; 
        }
        for(int i=0;i<digits.length;i++){
            if(i==0){
                continue;
            }
            arr[currIndex]=digits[i];
            printAll(currIndex+1, N, digits, arr);
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int[] digits = { 0, 1, 2, 3, 4 };
        int[] arr = new int[N];

        printAll(0, N, digits, arr);
    }
}
