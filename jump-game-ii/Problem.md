## leetcode - Jump Game Ii
- Time: 2015.01.17
- Tags: dynamic programming

### Problem Description [link][1]
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = `[2,3,1,1,4]`

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

### Solution
```java
public class Solution {
    public int jump(int[] A) {
        int dist = 0, steps = 0;
        for (int i = 0; dist < A.length - 1 && i <= dist; steps++){
            for (int fence = dist; i <= fence && i < A.length; i++){
                dist = Math.max(dist, i + A[i]);
            }
        }
        return (dist >= A.length - 1)? steps : 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/jump-game-ii/ "jump-game-ii"

