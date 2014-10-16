## leetcode - Container With Most Water
- Time: 2014.10.15
- Tags: greedy, hard

### Problem Description [link][1]
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.

### Solution
```java
public class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0, j = height.length - 1; i < j; ){
            area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) 
                i++;
            else
                j--;
        }
        return area;
    }
}
```

[1]: https://oj.leetcode.com/problems/container-with-most-water/ "container-with-most-water"

