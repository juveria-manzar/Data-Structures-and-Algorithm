class Solution {
    // Kadanes Algorithm Problem->
    // We carry the sub array sum as long as it gives us positive sum  
    // Brute force O(n3)-> O(n2)
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}