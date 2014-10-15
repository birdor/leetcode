## leetcode - Longest Substring Without Repeating Characters
- Time: 2014.10.14
- Tags: simulation, array

### Problem Description [link][1]
Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

### Solution
Iterate every character in the string. Let `lastPos` denote the last position (count from 1) where this char showed up and refer it at every iterated character. And let `mark` denote the last refered `lastPos` in the string. So, the characters after the `mark` to current position will all be unique. 

```java
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
```

[1]: https://oj.leetcode.com/problems/longest-substring-without-repeating-characters/ "longest-substring-without-repeating-characters"

