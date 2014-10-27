## leetcode - Best Time To Buy And Sell Stock Iii
- Time: 2014.10.27
- Tags: greedy

### Problem Description [link][1]
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).


### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/ "best-time-to-buy-and-sell-stock-iii"

