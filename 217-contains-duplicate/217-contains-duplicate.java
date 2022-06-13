class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set =new HashSet<>();
        
        for(int el: nums){
            set.add(el);
        }
        if(nums.length==set.size()){
            return false;
        }
        return true;
    }
}