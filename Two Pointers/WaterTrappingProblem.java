public class WaterTrappingProblem {

    //Brute-force approach
    //Better approach- prefix and sufix
    static int maxWater1(int[] arr,int n){
        int result=0;
        for(int i=1;i<n-1;i++){
            int left_max=find_left_max(arr,n,i);
            int right_max=find_right_max(arr,n,i);
            result+=Math.min(left_max,right_max)-arr[i];
        }
        return result;
    }

    static int find_left_max(int[] arr,int n,int i){
        int greatest=0;
        for(int j=0;j<=i;j++){
            greatest=Math.max(greatest,arr[j]);
        }
        return greatest;
    }

    static int find_right_max(int[] arr,int n,int i){
        int greatest=0;
        for(int j=n-1;j>=i;j--){
            greatest=Math.max(greatest,arr[j]);
        }
        return greatest;
    }

    static int maxWater(int[] arr, int n){
    
        int left = 0;
        int right = n - 1;

        int l_max = 0;
        int r_max = 0;

        int result = 0;
        while (left <= right)
        {
            if(arr[left]<=arr[right]){
                if(arr[left]>=l_max){
                    l_max=arr[left];
                }
                else{
                    result+=l_max-arr[left];
                }
                left++;
            }
            else{
                if(arr[right]>=r_max){
                    r_max=arr[right];
                }
                else{
                    result+=r_max-arr[right];
                }
                right--;
            }
        }
            return result;
        }
    
    public static void main(String []args) 
    {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(maxWater(arr, n));
        // System.out.println(maxWater1(arr, n));
    }
}