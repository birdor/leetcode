## leetcode - Unique Paths
- Time: 2014.10.19
- Tags: dynamic programming

### Problem Description [link][1]
A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?

### Solution
```java
public class Solution {
    public int uniquePaths(int m, int n) {
        int count[][] = new int[m + 1][n + 1];
        count[1][1] = 1;
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                count[i][j] += count[i - 1][j] + count[i][j - 1];
        return count[m][n];
    }
}
```

[1]: https://oj.leetcode.com/problems/unique-paths/ "unique-paths"

