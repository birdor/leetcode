## leetcode - Divide Two Integers
- Time: 2014.10.22
- Tags: bit operation

### Problem Description [link][1]
Divide two integers without using multiplication, division and mod operator.

### Solution
Be very careful with large numbers, especially MAX_INT and MIN_INT. They are the first cause of overflow.

```java
public class Solution {
    private static final int MAX_BITS = 32;
    public int divide(int dividend, int divisor) {
        long a = Math.abs((long)dividend), b = Math.abs((long)divisor);
        long ans = 0, i = 0;
        while (b <= a){
            for (i = 0; i < MAX_BITS; i++){
                if ((b << i) > a){
                    break;
                }
            }
            ans += 1 << (i - 1);
            a -= (b << (i - 1));
        }
        return (dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0)? (int) ans : (int)-ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/divide-two-integers/ "divide-two-integers"

