## leetcode - Sqrtx
- Time: 2014.10.16
- Tags: simulation

### Problem Description [link][1]
Implement `int sqrt(int x)`.

Compute and return the square root of x.

### Solution
Never use `k = (i + j) / 2`! Instead, `k = i + (j - i) / 2` or `k = i / 2 + j / 2 + (i & j & 1)` is more safe against overflow.

Moreover, overflow should be taken care of on comparision like `a * b > c`.


```java
public class Solution {
    public int sqrt(int x) {
        if (x == 0) return 0;
        int i = 1, j = x;
        while (i < j - 1){
            int k = i + (j - i) / 2;
            if ((long)k * k > x){
                j = k;
            }else{
                i = k;
            }
        }
        return i;
    }
}
```

[1]: https://oj.leetcode.com/problems/sqrtx/ "sqrtx"

