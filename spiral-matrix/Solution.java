/**
	leetcode - Spiral Matrix
	Time: O(n^2)
	Space: O(1)
	Completed: 2015.1.17
*/

import java.util.*;

public class Solution {
    static final int[] dx = {0, +1, 0, -1};
    static final int[] dy = {+1, 0, -1, 0};
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> seq = new LinkedList<Integer>();
        if (matrix.length == 0 || matrix[0].length == 0){
            return seq;
        }
        int x = 0, y = 0, t = 0;
        int xmin = 0, xmax = matrix.length, ymin = 0, ymax = matrix[0].length;
        while (xmin < xmax && ymin < ymax){
            seq.add(matrix[x][y]);
            int x2 = x + dx[t], y2 = y + dy[t];
            if (x2 < xmin || x2 == xmax || y2 < ymin || y2 == ymax){
                t = (t + 1) % 4;
                xmin += (dx[t] + 1) / 2;
                xmax += (dx[t] - 1) / 2;
                ymin += (dy[t] + 1) / 2;
                ymax += (dy[t] - 1) / 2;
            }
            x = x + dx[t]; 
            y = y + dy[t];
        }
        return seq;
    }
    public static void main(String[] args) {
    	int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    	Solution so = new Solution();
    	List<Integer> list = so.spiralOrder(mat);
    }
}