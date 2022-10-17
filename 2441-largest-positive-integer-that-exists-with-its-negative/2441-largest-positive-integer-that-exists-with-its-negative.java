class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int res =-1;
        
        for(int n :nums){
            hs.add(n);
        }
        
        for(int p: nums){
            if(hs.contains(-p)){
                res = Math.max(res, p);
            }
        }
        
        return res;
    }
}