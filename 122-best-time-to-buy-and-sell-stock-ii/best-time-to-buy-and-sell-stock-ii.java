class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int buy = prices[0];
        int profit = 0;
        int sum = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }

            else
            {
                profit = prices[i] - buy;
                buy = prices[i];
                sum += profit;
            }
        }
        return sum;
    }
}