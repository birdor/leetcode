## leetcode - Reverse Integer
- Time: 2014.10.01
- Tags: simulation


### Problem Description [link][1]
Reverse digits of an integer.

- Example1: x = 123, return 321
- Example2: x = -123, return -321


### Solution
```java
public class Solution {
    public int reverse(int x) {
        int ans = 0;
        int num = Math.abs(x);
        while (num != 0){
        	ans = ans * 10 + num % 10;
        	num = num / 10;
        }
        return x >= 0 ? ans : -ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/reverse-integer/ "reverse-integer"

