## leetcode - Best Time To Buy And Sell Stock Ii
- Time: 2014.10.27
- Tags: greedy

### Problem Description [link][1]
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).

### Solution
```java
public class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++)
            if (i > 0 && prices[i] - prices[i - 1] > 0)
                profit += prices[i] - prices[i - 1];
        return profit;
    }
}
```

[1]: https://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/ "best-time-to-buy-and-sell-stock-ii"

