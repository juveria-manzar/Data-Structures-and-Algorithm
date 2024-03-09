class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftAns = new int[len];
        int[] rightAns = new int[len];
        int[] ans = new int[len];
        
        leftAns[0] = nums[0];
        rightAns[len-1] = nums[len-1];
        
        for(int i=1, j=len-2;i<nums.length && j>=0;i++,j--){
            leftAns[i] = leftAns[i-1]* nums[i];
            rightAns[j] = rightAns[j+1]*nums[j];
        }
        
        for(int i=0;i<len;i++){
            ans[i]=(i==0?1:leftAns[i-1])*(i==len-1?1:rightAns[i+1]);
        }
        
        return ans;
    }
}