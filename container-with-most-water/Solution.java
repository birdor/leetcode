/**
	leetcode - Container With Most Water
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.15
*/
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