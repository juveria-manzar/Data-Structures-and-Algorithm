class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        int left = 0;
        int right = 0;
        boolean flag=false;
        
        int n = nums.length;
        
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                flag=true;
            }
            if(flag){
                min= Math.min(min, nums[i]);
            }
        }
        flag = false;
        for(int i=n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                flag=true;
            }
            if(flag){
                max= Math.max(max, nums[i]);
            }
        }
        
        for(left=0;left<n;left++){
            if(min<nums[left]){
                break;
            }
        }
        
        for(right=n-1;right>=0;right--){
            if(max>nums[right]){
                break;
            }
        }
        
        return right-left<0?0:right-left+1;
    }
}