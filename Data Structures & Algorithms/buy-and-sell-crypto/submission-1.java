class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit=0;
        int minCost = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minCost = Math.min(minCost,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-minCost);
        }
        return maxProfit;
    }
}
