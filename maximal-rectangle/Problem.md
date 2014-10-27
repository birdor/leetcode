## leetcode - Maximal Rectangle
- Time: 2014.10.24
- Tags: stack, array

### Problem Description [link][1]
Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.

### Solution
```java
import java.util.*;
public class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int n = matrix.length, m = matrix[0].length;
        int[] last = new int[m];
        int[] height = new int[m];
        Arrays.fill(last, -1);
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == '0') last[j] = i;
                height[j] = i - last[j];
            }
            ans = Math.max(ans, maxRectInHist(height));
        }
        return ans;
    }
    private int maxRectInHist(int[] height){
        int[] h = new int[height.length + 2];
        System.arraycopy(height, 0, h, 1, height.length);
        int[] stack = new int[h.length];
        int t = 0, area = 0;
        for (int i = 0; i < h.length; i++){
            while (t > 0 && h[stack[t - 1]] > h[i]){
                int j = stack[--t];
                area = Math.max(area, h[j] * (i - stack[t - 1] - 1));
            }
            stack[t++] = i;
        }
        return area;
    }
}
```

[1]: https://oj.leetcode.com/problems/maximal-rectangle/ "maximal-rectangle"

