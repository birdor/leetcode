/**
	leetcode - Unique Paths
	Time: O(n * m)
	Space: O(n * m)
	Completed: 2014.10.19
*/
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