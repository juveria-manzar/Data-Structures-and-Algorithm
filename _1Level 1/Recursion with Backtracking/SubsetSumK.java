public class SubsetSumK {
    public static boolean subsetSumK(int currIndex, int K, int N, int[] arr) {
        if(currIndex==N){
            if(K==0){
                return true;
            }
            return false;
        }
        boolean a1=subsetSumK(currIndex+1, K-arr[currIndex], N, arr);
        boolean a2=subsetSumK(currIndex+1, K, N, arr);

        return a1||a2;
    }
    public static void main(String[] args) {
        int N=3;
        int[] arr={5,-2,9};
        int k=7;

        System.out.println(subsetSumK(0,k,N,arr));
    }
}
