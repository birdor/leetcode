## leetcode - Longest Common Prefix
- Time: 2014.10.15
- Tags: simulation, string

### Problem Description [link][1]
Write a function to find the longest common prefix string amongst an array of strings.

### Solution
```java
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        for (int i = 0; i < strs[0].length(); i++)
            for (int j = 0; j < strs.length; j++)
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i))
                    return strs[0].substring(0, i);
        return strs[0];
    }
}
```

[1]: https://oj.leetcode.com/problems/longest-common-prefix/ "longest-common-prefix"

