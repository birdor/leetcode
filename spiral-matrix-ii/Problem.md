## leetcode - Spiral Matrix Ii
- Time: 2015.01.06
- Tags: simulation

### Problem Description [link][1]
Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

For example,
Given n = 3,

You should return the following matrix:
```
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
```

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/spiral-matrix-ii/ "spiral-matrix-ii"

