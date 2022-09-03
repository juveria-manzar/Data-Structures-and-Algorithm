class Solution {
     // The idea is to use BFS to try appending 0 - 9 to each number 
    // starting from a single digit 1 - 9 until the number has n digits
    public int[] numsSameConsecDiff(int n, int k) {
        // push all numbers with single digit to a deque
        ArrayDeque<Integer> q = new ArrayDeque<>();
        
        for(int i=1;i<10;i++){
            q.add(i);
        }
        
        while(--n > 0){
            
            int sq = q.size();
            // for each item in the current queue,
            // do the following logic
            for (int i = 0; i < sq; i++) {
                // get the first number from the queue 
                 // pop it
                int p = q.remove();
                // we can potentially add 0 to 9 to the current number p
                for (int j = 0; j < 10; j++) {
                    // we use p % 10 to get the last digit of p
                    // then get the difference with j
                    // since (p % 10) - j can be negative and positive
                    // we use abs to cover both case
                  if (Math.abs((p % 10) - j) == k) {
                    // if the difference is equal to k
                    // we can include digit j 
                    // so multiply the current number by 10 and add j
                    q.add(p * 10 + j);
                  }
                }
               
        }
             // return all numbers in deque, return them in [int]
        
            
    }
        int[] integers = q.stream().mapToInt(Integer::intValue).toArray();
         return integers;
    }
}