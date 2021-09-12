public class PrintNumbersOfNdigits1 {

    public static void printAll(int currInd,int N,int[] digits,int[] arr){
        if(currInd==N){
            for(int i=0;i<N;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            return;
        }

        for(int i=0;i<digits.length;i++){
            arr[currInd]=digits[i];
            printAll(currInd+1, N, digits, arr);
        }

    }
    public static void main(String[] args) {
        int N=3;
        int[] digits={1,2};
        int[] arr=new int[N];
        printAll(0,N,digits,arr);
    }
}
