## leetcode - Candy
- Time: 2014.11.08
- Tags: greedy

### Problem Description [link][1]
There are N children standing in a line. Each child is assigned a rating value.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
What is the minimum candies you must give?

### Solution
```java
public class Solution {
    public int candy(int[] ratings) {
        int[] n = new int[ratings.length];
        
        for (int i = 1; i < ratings.length; i++)
            n[i] = (ratings[i] > ratings[i - 1])? n[i - 1] + 1 : 0;
        for (int i = ratings.length - 2; i >= 0; i--)
            n[i] = (ratings[i] > ratings[i + 1])? Math.max(n[i + 1] + 1, n[i]) : n[i];
            
        int sum = 0;
        for (int i = 0; i < ratings.length; i++)
            sum += n[i];

        return sum + ratings.length;
    }
}
```

[1]: https://oj.leetcode.com/problems/candy/ "candy"

