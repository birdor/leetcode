## leetcode - Best Time To Buy And Sell Stock
- Time: 2014.10.27
- Tags: greedy, dynamical programming

### Problem Description [link][1]
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock/ "best-time-to-buy-and-sell-stock"

