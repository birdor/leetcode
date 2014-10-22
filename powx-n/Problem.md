## leetcode - Powx N
- Time: 2014.10.21
- Tags: divide and conquer

### Problem Description [link][1]
Implement `pow(x, n)`.


### Solution
```java
public class Solution {
    public double pow(double x, int n) {
        if (n == 0) return 1;
        double y = pow(x, n / 2);
        return ((n & 1) == 0)? y * y : ((n > 0)? y * y * x : y * y / x);
    }
}
```

[1]: https://oj.leetcode.com/problems/powx-n/ "powx-n"

