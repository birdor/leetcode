## leetcode - Palindrome Number
- Time: 2014.10.15
- Tags: brutal force, simulation

### Problem Description [link][1]
Determine whether an integer is a palindrome. Do this without extra space.


### Solution
```java
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        long a = x, b = 0;
        while (x > 0){
            b = b * 10 + x % 10;
            x /= 10;
        }
        return (a == b);
    }
}
```

[1]: https://oj.leetcode.com/problems/palindrome-number/ "palindrome-number"

