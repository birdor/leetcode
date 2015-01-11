## leetcode - Factorial Trailing Zeroes
- Time: 2015.01.04
- Tags: simulation

### Problem Description [link][1]
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.


### Solution
```java
public class Solution {
    public int trailingZeroes(int n) {
        int sum = 0;
        for (int d = n / 5; d > 0; d /= 5){
        	sum += d;
        }
        return sum;
    }
}
```

[1]: https://oj.leetcode.com/problems/factorial-trailing-zeroes/ "factorial-trailing-zeroes"

