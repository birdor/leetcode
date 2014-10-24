/**
	leetcode - Largest Rectangle In Histogram
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.24
*/
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