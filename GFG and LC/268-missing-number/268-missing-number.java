class Solution {
        // Sum approach TC: O(n)
    // SC : O(1)
    public int missingNumber(int[] nums) {
        int total = 0;
        for(int el: nums){
            total += el;
        }
        int n = nums.length;
        return ((n)*(n+1))/2 - total;
    }
}