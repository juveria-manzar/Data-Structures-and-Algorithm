public class WaterTrappingProblem {

    //Brute-force approach

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
    
        // indices to traverse the array
        int left = 0;
        int right = n - 1;
    
        // To store Left max and right max 
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;
    
        // To store the total amount 
        // of rain water trapped
        int result = 0;
        while (left <= right)
        {
    
        // We need check for minimum of left 
        // and right max for each element
            if(r_max <= l_max)
            {
        
                // Add the difference between 
                // current value and right max at index r
                result += Math.max(0, r_max-arr[right]);
        
                // Update right max
                r_max = Math.max(r_max, arr[right]);
        
                // Update right pointer
                right -= 1;
            }
            else
            { 
        
                // Add the difference between 
                // current value and left max at index l
                result += Math.max(0, l_max-arr[left]);
        
                // Update left max
                l_max = Math.max(l_max, arr[left]);
        
                // Update left pointer
                left += 1;
            }
            }
            return result;
        }
    
    public static void main(String []args) 
    {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = arr.length;
        System.out.println(maxWater(arr, n));
        System.out.println(maxWater1(arr, n));
    }
}