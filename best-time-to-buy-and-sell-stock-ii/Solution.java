/**
	leetcode - Best Time To Buy And Sell Stock Ii
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.27
*/
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++)
            if (i > 0 && prices[i] - prices[i - 1] > 0)
                profit += prices[i] - prices[i - 1];
        return profit;
    }
}