class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] freqS = new int[26];
        int[] freqT = new int[26];
        
        for(char ch: s.toCharArray()){
            freqS[ch-'a']++;
        }
        
        for(char ch: target.toCharArray()){
            freqT[ch-'a']++;
        }
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<26;i++){
            if(freqT[i]>0)
                ans = Math.min(freqS[i]/freqT[i],ans);
        }
        return ans;
    }
}