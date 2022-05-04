class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        if(k==1){
            return 0;
        }
        for(int n: nums){
            if(map.containsKey(k-n)){
                int freq = map.get(k-n);
                if(freq==1){
                    map.remove(k-n);
                }
                else{
                    map.put(k-n, freq-1);
                }
                count++;
            }
            else{
                map.put(n, map.getOrDefault(n, 0)+1);
            }
        }
        
        return count;
    }
}