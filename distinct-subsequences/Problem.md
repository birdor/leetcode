## leetcode - Distinct Subsequences
- Time: 2015.01.11
- Tags: 

### Problem Description [link][1]
Given a string S and a string T, count the number of distinct subsequences of T in S.

A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).

Here is an example:
S = "rabbbit", T = "rabbit"

Return 3.

### Solution
```java
public class Solution {
    public int numDistinct(String S, String T) {
        int n = S.length(), m = T.length();
        if (m == 0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        int[][] count = new int[n][m];
        count[0][0] = (S.charAt(0) == T.charAt(0))? 1 : 0;
        for (int i = 1; i < n; i++){
            count[i][0] = count[i - 1][0] + (S.charAt(i) == T.charAt(0) ? 1 : 0);
            for (int j = 1; j < m; j++){
                count[i][j] = count[i - 1][j] + count[i - 1][j - 1] * (S.charAt(i) == T.charAt(j) ? 1 : 0);
            }
        }
        return count[n - 1][m - 1];
    }
}
```

[1]: https://oj.leetcode.com/problems/distinct-subsequences/ "distinct-subsequences"

