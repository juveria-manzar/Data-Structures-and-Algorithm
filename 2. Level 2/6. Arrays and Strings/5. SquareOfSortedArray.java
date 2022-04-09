class Main {
    int[] squareOfSortedArray(int[] nums){
        int[] ans = new int[nums.length];
        int j = nums.length-1;
        int i = 0;
        int k = nums.length-1;
        while(i<=j){
            if(nums[i]*nums[i]> nums[j]*nums[j]){
                ans[k] = nums[i]*nums[i];
                i++;
            }else{
                ans[k] = nums[j]*nums[j];
                j--;
            }
            k--;
        }
        return ans;
    }
}