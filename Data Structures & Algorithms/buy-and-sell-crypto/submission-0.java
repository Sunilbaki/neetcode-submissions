class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_stock=0;

        for(int i=1;i< prices.length;i++)
        {
            if(min > prices[i])
            {
                min= prices[i];
            }
            else if(max_stock < (prices[i]-min))
            {
                max_stock= (prices[i]-min);
            }
        }

        return max_stock;
    }
}
