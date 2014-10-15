## leetcode - Longest Palindromic Substring
- Time: 2014.10.14
- Tags: simulation

### Problem Description [link][1]
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.


### Solution
Brutal force.

Remember to include the circumstances where the palindrome has even length. 
```java
public class Solution {
    public String longestPalindrome(String s) {
    	int maxlen = 0;
    	String ans = "";
        for (int i = 0; i < s.length(); i++){
        	int l, r;
        	for (l = r = i; l >= 0 && r < s.length(); l--, r++)
        		if (s.charAt(l) != s.charAt(r)) break;
        	if (r - l - 1 > maxlen){
        		maxlen = r - l - 1;
        		ans = s.substring(l + 1, r);
        	}
        	for (l = i, r = i + 1; l >= 0 && r < s.length(); l--, r++)
        		if (s.charAt(l) != s.charAt(r)) break;
        	if (r - l - 1 > maxlen){
        		maxlen = r - l - 1;
        		ans = s.substring(l + 1, r);
        	}
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/longest-palindromic-substring/ "longest-palindromic-substring"

