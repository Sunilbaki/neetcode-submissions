class Solution {
    public int maxProfit(int[] prices) {
      int stock = prices[0];
      int stockMax = 0;
      int max = 0;
      for (int i =1; i<prices.length; i++)
      {
         if(stock >= prices[i])
         {
            stock = prices[i];
            stockMax = 0;
         }
         else if(stockMax <= prices[i]){
            max = Math.max(max, prices[i]-stock);
            stockMax = prices[i];
           
         }
      }
      return max;
    }
}
