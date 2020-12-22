public class LargestSubArrayforSum {
    static int computeMaxWindow(int[] arr,int sum){
        int i=0,j=0,start=0;
        int curr_sum=0,m_l=0;
        while(j<arr.length){
            curr_sum+=arr[j];
            if(curr_sum<sum){
                j++;
            }
            else if(curr_sum==sum){
                start=i;
                m_l=Math.max(m_l, j-i+1);
                j++;
            }
            else if(curr_sum>sum){
                while(curr_sum>sum){
                    curr_sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        System.out.println(start);
        System.out.println("Sum is found within indices " + start + " and " + m_l);
        return m_l;
    }
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,5};
        int sum=5;
        int max=computeMaxWindow(arr, sum);
        System.out.println(max);
    }
}
