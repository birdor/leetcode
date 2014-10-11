## leetcode - Decode Ways
- Time: 2014.09.30
- Tags: dynamic programming

### Problem Description [link][1]
A message containing letters from A-Z is being encoded to numbers using the following mapping:
```
'A' -> 1
'B' -> 2
...
'Z' -> 26
```
Given an encoded message containing digits, determine the total number of ways to decode it.

For example,
Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

The number of ways decoding "12" is 2.


### Solution
Dynamic programming. Let c[i] denote the number of possibilities of decode of substring s[0..i - 1]. 
There are four conditions:

- `s[i - 1] == '0' && s[i] == '0'` No such decode solution, so return 0;
- `s[i - 1] != '0' && s[i] == '0'` s[i - 1] and s[i] must be one letter. So, return c[i - 1];
- `s[i - 1] == '0' && s[i] != '0'` s[i] can only be considered seperately from the previous one. So, return c[i];
- `s[i - 1] != '0' && s[i] != '0'` s[i] and s[i - 1] can be considered either together or seperately. So, return c[i] + c[i - 1]; 


```java
public class Solution {
    public int numDecodings(String s) {
    	if (s.isEmpty() || s.charAt(0) == '0') return 0;
        int[] count = new int[s.length() + 1];
        count[0] = count[1] = 1;
        for (int i = 2; i <= s.length(); i++){
        	count[i] = s.charAt(i - 1) == '0' ? 0 : count[i - 1];
        	int tmp = Integer.parseInt(s.substring(i - 2, i));
        	if (s.charAt(i - 2) != '0' && tmp > 0 && tmp <= 26)
        		count[i] += count[i - 2];
        	if (tmp == 0)
        		return 0;
        }
        return count[s.length()];
    }
}
```

[1]: https://oj.leetcode.com/problems/decode-ways/ "decode-ways"

