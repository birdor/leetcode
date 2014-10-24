## leetcode - Largest Rectangle In Histogram
- Time: 2014.10.24
- Tags: stack

### Problem Description [link][1]
Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.

For example,
Given `height = [2,1,5,6,2,3]`,
return `10`.

### Solution
```java
public class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length + 2, ans = 0;
        int[] tmp = new int[n];
        System.arraycopy(height, 0, tmp, 1, n - 2);
        height = tmp;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for (int i = 0; i < n; i++){
            while (stack.size() > 0 && height[stack.peek()] > height[i])
                ans = Math.max(ans, height[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/largest-rectangle-in-histogram/ "largest-rectangle-in-histogram"

