/**
	leetcode - Spiral Matrix Ii
	Time: O(n^2)
	Space: O(n^2)
	Completed: 2015.1.6
*/
public class Solution {
    private final int[][] step = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int nn = n * n, i = 0, j = 0, t = 0;
        for (int k = 1; k <= nn; k++){
            matrix[i][j] = k;
            int i2 = i + step[t][0], j2 = j + step[t][1];
            if (i2 < 0 || i2 >= n || j2 < 0 || j2 >= n || matrix[i2][j2] > 0){
                t = (t + 1) % 4; // turn a direction
            }
            i += step[t][0];
            j += step[t][1];
        }
        return matrix;
    }
}