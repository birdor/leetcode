/**
	leetcode - Best Time To Buy And Sell Stock Iii
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.27
*/
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int foot = prices[0], peak = 0;
        int[] profit = new int[prices.length];
        for (int i = 1; i < prices.length; i++){
            profit[i] = Math.max(profit[i - 1], prices[i] - foot);
            foot = Math.min(foot, prices[i]);
        }
        int answer = 0;
        for (int i = prices.length - 1; i >= 0; i--){
            answer = Math.max(answer, profit[i] + peak - prices[i]);
            peak = Math.max(peak, prices[i]);
        }
        return answer;
    }
}