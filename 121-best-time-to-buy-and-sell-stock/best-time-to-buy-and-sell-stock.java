class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buy = prices[0];
        for(int i=1;i<n;i++){
            if(buy>prices[i]){
                buy = prices[i];
            }else {
                int sell = prices[i];
                maxProfit = Math.max(maxProfit , sell - buy);
            }
        }
        return maxProfit;
    }
}