## leetcode - Word Break
- Time: 2014.10.12
- Tags: dynamic programming

### Problem Description [link][1]
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".


### Solution
Let `breakPoint[i] = true` denote that `S[0..i - 1]` can be split into valid words. So, `breakPoint[i] = breakPoint[j] and (S[j..i - 1] is a word) for any j < i`.

```java
import java.util.HashSet;
public class Solution {
    public boolean wordBreak(String s, HashSet<String> dict) {
    	boolean[] breakPoint = new boolean[s.length() + 1];
    	breakPoint[0] = true;
        for (int i = 1; i <= s.length(); i++){
        	for (int j = 0; j < i; j++){
        		breakPoint[i] = breakPoint[j] && dict.contains(s.substring(j, i));
        		if (breakPoint[i]) break;
        	}
        }
        return breakPoint[s.length()];
    }
}
```

[1]: https://oj.leetcode.com/problems/word-break/ "word-break"

