## leetcode - Spiral Matrix
- Time: 2015.01.17
- Tags: simulation, array

### Problem Description [link][1]
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

For example,
Given the following matrix:
`
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
`
You should return `[1,2,3,6,9,8,7,4,5]`.

### Solution
```java
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
}
```

[1]: https://oj.leetcode.com/problems/spiral-matrix/ "spiral-matrix"

