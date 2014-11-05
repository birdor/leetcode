## leetcode - Maximum Subarray
- Time: 2014.11.04
- Tags: greedy

### Problem Description [link][1]
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array `[−2,1,−3,4,−1,2,1,−5,4]`,
the contiguous subarray `[4,−1,2,1]` has the largest `sum = 6`.

### Solution
```java
public class Solution {
    public int maxSubArray(int[] A) {
        int sum = 0, max = -Integer.MIN_VALUE;
        for (int a : A){
            sum = (sum + a < 0)? 0 : sum + a;
            max = Math.max(max, sum);
        }
        if (max == 0){
            if (A.length > 0){
                max = A[0];
            }
            for (int a : A){
                max = Math.max(max, a);
            }
        }
        return max;
    }
}
```

[1]: https://oj.leetcode.com/problems/maximum-subarray/ "maximum-subarray"

