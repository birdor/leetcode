/**
	leetcode - Minimum Path Sum
	Time: O(n*m)
	Space: O(n*m)
	Completed: 2015.1.7
*/
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