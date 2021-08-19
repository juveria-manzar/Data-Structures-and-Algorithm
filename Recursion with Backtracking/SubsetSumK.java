public class SubsetSumK {

    public static void subsetSumK(int currIndex, int K, int N, int[] arr) {
        if(currIndex==N){
            if(K==0){
                System.out.println("true");
            }
            return;
        }

        subsetSumK(currIndex+1, K-arr[currIndex], N, arr);
        subsetSumK(currIndex+1, K, N, arr);
    }
    public static void main(String[] args) {
        int N=3;
        int[] arr={5,-2,9};
        int k=7;

        subsetSumK(0,k,N,arr);
    }
}
