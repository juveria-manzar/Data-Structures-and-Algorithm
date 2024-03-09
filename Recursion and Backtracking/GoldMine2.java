import java.util.*;

public class GoldMine2 {
    static int max=0;
    static int currGoldCollection=0;
    public static void getMaxGold(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]!=0){
                    dfs(i,j,arr);
                }
                max=Math.max(currGoldCollection,max);
            }
        }
    }

    public static void dfs(int i,int j, int[][] arr){
        if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]==0){
            return;
        }
        currGoldCollection+=arr[i][j];
        arr[i][j]=0;
        dfs(i-1,j,arr);
        dfs(i+1,j,arr);
        dfs(i,j+1,arr);
        dfs(i,j-1,arr);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0 ; j  < arr[0].length; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		getMaxGold(arr);
		System.out.println(max);
    }
}
