/**
	leetcode - Longest Substring Without Repeating Characters
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.14
*/
public class Solution {
	static final int NCHAR = 256;
    public int lengthOfLongestSubstring(String s) {
    	int[] lastPos = new int[NCHAR];
 		int ans = 0, mark = 0;
 		for (int i = 0; i < s.length(); i++){
			mark = Math.max(mark, lastPos[s.charAt(i)]);
			ans = Math.max(ans, i - mark + 1);
			lastPos[s.charAt(i)] = i + 1;
 		}
 		return ans;
    }
}