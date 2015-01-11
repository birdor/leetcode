## leetcode - Minimum Path Sum
- Time: 2015.01.07
- Tags: dynamic programming

### Problem Description [link][1]
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

### Solution
```java
public class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int upper = (i > 0)? sum[i - 1][j] : Integer.MAX_VALUE;
                int left = (j > 0)? sum[i][j - 1] : Integer.MAX_VALUE;
                sum[i][j] = grid[i][j] + ((i == 0 && j == 0)? 0 : Math.min(upper, left));
            }
        }
        return sum[n - 1][m - 1];
    }
}
```

[1]: https://oj.leetcode.com/problems/minimum-path-sum/ "minimum-path-sum"

