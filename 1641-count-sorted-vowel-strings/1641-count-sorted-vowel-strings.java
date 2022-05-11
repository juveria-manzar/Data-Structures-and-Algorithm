class Solution {
    public int countVowelStrings(int n) {
        int [][] dp = new int[n+1][6];
        dp[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 6; j++) {
                if (i == 1) {
                    dp[i][j] = dp[i][j-1] + 1;
                }
                else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[n][5];
    }
}