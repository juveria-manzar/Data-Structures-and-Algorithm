class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] inwardDegree = new int[n+1];
        int[] outwardDegree = new int[n+1];
        
        for(int i=0;i<trust.length;i++){
            int countOut = outwardDegree[trust[i][0]];
            outwardDegree[trust[i][0]]= countOut+1;
            
            int countIn = inwardDegree[trust[i][1]];
            inwardDegree[trust[i][1]] = countIn+1;
        }
        
        for(int i=1;i<=n;i++){
            if(inwardDegree[i] == n-1 && outwardDegree[i]==0 ){
                return i;
            }
        }
        
        return -1;
        
    }
}