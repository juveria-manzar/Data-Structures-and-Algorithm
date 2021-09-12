public class MaxSubArray {
    int maxSubArray(int size,int[]arr, int k){
        int i=0, j=0,sum=0,mxsum=0;
        while(j<size){
            sum+=arr[j];
            // System.out.println(sum);
            if(j-i+1<k){
                System.out.println(j-i+1);
                j++;
            }
            else if(j-i+1==k){
                // System.out.println(mxsum);
                mxsum=Integer.max(sum, mxsum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return mxsum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20}; 
        int k = 4; 
        MaxSubArray o=new MaxSubArray();
        System.out.println(o.maxSubArray(arr.length, arr, k));

    }
}
