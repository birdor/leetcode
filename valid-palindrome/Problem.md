## leetcode - Valid Palindrome
- Time: 2014.10.20
- Tags: 

### Problem Description [link][1]
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
`"A man, a plan, a canal: Panama"` is a palindrome.
`"race a car"` is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

### Solution
```java
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = "a" + s + "a";
        int i = 0, j = s.length() - 1;
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
            while (!alphanumeric(s.charAt(i))) i++;
            while (!alphanumeric(s.charAt(j))) j--;
        }
        return true;
    }
    private boolean alphanumeric(char c){
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
```

[1]: https://oj.leetcode.com/problems/valid-palindrome/ "valid-palindrome"

