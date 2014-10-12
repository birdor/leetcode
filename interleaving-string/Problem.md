## leetcode - Interleaving String
- Time: 2014.10.11
- Tags: thinking, dynamic programming

### Problem Description [link][1]
Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.

For example,
Given:
s1 = `"aabcc"`,
s2 = `"dbbca"`,

When s3 = `"aadbbcbcac"`, return true.
When s3 = `"aadbbbaccc"`, return false.

### Solution

Let S[i, j] denote the possibility that first i chars of s1 and first j chars of s2 can compose first i + j chars of s3. Then, 

`S[i, j] = s1[i - 1] == i > 0 && s3[i + j - 1] && S[i - 1, j] || j > 0 && s2[j - 1] ==  s3[i + j - 1] && S[i, j - 1]`

```java
public class Solution {
	static final int NCHAR = 256;
    public boolean isInterleave(String s1, String s2, String s3){
    	if (s1.isEmpty()) return s2.equals(s3);
    	if (s2.isEmpty()) return s1.equals(s3);
    	if (s1.length() + s2.length() != s3.length()) return false;
    	boolean[][] status = new boolean[s1.length() + 1][s2.length() + 1];
    	status[0][0] = true;
    	for (int i = 0; i <= s1.length(); i++)
    		for (int j = 0; j <= s2.length(); j++)
    			status[i][j] = status[i][j] || i > 0 && s1.charAt(i - 1) == s3.charAt(i + j - 1) && status[i - 1][j]
    				|| j > 0 && s2.charAt(j - 1) == s3.charAt(i + j - 1) && status[i][j - 1];
    	return status[s1.length()][s2.length()];
    }
}
```

[1]: https://oj.leetcode.com/problems/interleaving-string/ "interleaving-string"

