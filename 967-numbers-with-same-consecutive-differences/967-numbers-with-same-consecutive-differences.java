class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        HashSet<Integer> output = new HashSet<>(); // Hashset to avoid dupes (e.g k == 0)
        Queue<Integer> queue = new LinkedList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        while(!queue.isEmpty()){
            int currVal = queue.poll();
            int lastDigit = currVal % 10;
            int numDigits = (int)Math.log10(currVal) + 1;
            
            if(numDigits == n){
                output.add(currVal);
                continue;
            }
            
            int nextAddDigit = lastDigit + k;
            int nextSubDigit = lastDigit - k;

            if(nextAddDigit >= 0 && nextAddDigit <= 9) queue.add((currVal*10) + nextAddDigit);
            if(nextSubDigit >= 0 && nextSubDigit <= 9) queue.add((currVal*10) + nextSubDigit); 
        }
        
        int ind = 0;
        int[] outputarr = new int[output.size()];
        for(int i: output){ outputarr[ind++] = i; }
        
        return outputarr;
    }
}