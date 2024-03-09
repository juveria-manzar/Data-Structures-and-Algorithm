class Solution {
    public int fillCups(int[] amount) {
        //Max PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        
        for(int el: amount){
            pq.add(el);
        }
        
        int ans = 0;
        
        while(!pq.isEmpty()){
            int first = pq.remove();
            int second = pq.remove();
            
            if(first<=0 && second<=0){
                break;
            }
            first--;
            second--;
            
            pq.add(first);
            pq.add(second);
            ans++;
        }
        return ans;
    }
}