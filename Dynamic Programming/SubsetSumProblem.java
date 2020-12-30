public class SubsetSumProblem {
    static boolean result(int arr[],int sum){
        int n=arr.length;
        boolean[][] dp=new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0&&j==0){
                    dp[i][j]=true;
                }
                else if(i==0){
                    dp[i][j]=false;
                }
                else if(j==0){
                    dp[i][j]=true;
                }
                else{
                    if(arr[i-1]>j){
                        dp[i][j]=false;
                    }
                    else if(arr[i-1]<=j){
                        dp[i][j]=dp[i][j-arr[i-1]]||dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[]=new int[]{4,2,3,1,7};
        int sum=10;
        boolean res=result(arr, sum);
        System.out.println(res);
    }
}
