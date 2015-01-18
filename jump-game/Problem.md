## leetcode - Jump Game
- Time: 2015.01.17
- Tags: simulation

### Problem Description [link][1]
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = `[2,3,1,1,4]`, return true.

A = `[3,2,1,0,4]`, return false.

### Solution
```java
public class Solution {
    public boolean canJump(int[] A) {
        int distance = 0;
        for (int i = 0; i < A.length; i++){
            if (i > distance){
                return false;
            }
            if (i + A[i] > distance){
                distance = i + A[i];
            }
        }
        return true;
    }
}
```

[1]: https://oj.leetcode.com/problems/jump-game/ "jump-game"

