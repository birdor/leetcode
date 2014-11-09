## leetcode - Climbing Stairs
- Time: 2014.11.08
- Tags: dynamic programming

### Problem Description [link][1]
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

### Solution
```java
public class Solution {
    public int climbStairs(int n) {
        int last1 = 1, last2 = 0;
        for (int i = 0; i < n; i++){
            int tmp = last1 + last2;
            last2 = last1;
            last1 = tmp;
        }
        return last1;
    }
}
```

[1]: https://oj.leetcode.com/problems/climbing-stairs/ "climbing-stairs"

