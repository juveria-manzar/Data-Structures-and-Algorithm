class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice=0;
        int maxProfit=0;
        
        for(int i=prices.length-1;i>=0;i--){
            buyingPrice=Integer.max(buyingPrice,prices[i]);
            maxProfit=Integer.max(maxProfit,buyingPrice-prices[i]);
        }
        
        return maxProfit;
    }
}