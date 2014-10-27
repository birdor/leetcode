/**
	leetcode - Best Time To Buy And Sell Stock
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.27
*/
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int foot = Integer.MAX_VALUE;
        for (int p : prices){
            profit = Math.max(profit, p - foot);
            foot = Math.min(foot, p);
        }
        return profit;
    }
}