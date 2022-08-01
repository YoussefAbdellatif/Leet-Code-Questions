class Solution {
  public int maxProfit(int[] prices) {
       int currentMaxProfit = 0;
       int currentmin = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
                if(prices[i]<currentmin)
                  currentmin = prices[i];
                if (currentMaxProfit <(prices[i]-currentmin))
                    currentMaxProfit =prices[i]-currentmin;
               
                }
   return currentMaxProfit;         
   }
}