## leetcode - First Missing Positive
- Time: 2014.10.22
- Tags: array

### Problem Description [link][1]
Given an unsorted integer array, find the first missing positive integer.

For example,
Given `[1,2,0]` return `3`,
and `[3,4,-1,1]` return `2`.

Your algorithm should run in O(n) time and uses constant space.

### Solution
```java
public class Solution {
    public int firstMissingPositive(int[] A) {
        for (int i = 0; i < A.length; i++){
            int j = A[i];
            A[i] = 0;
            while (j >= 1 && j <= A.length && A[j - 1] != j){
                int tmp = A[j - 1];
                A[j - 1] = j;
                j = tmp;
            }
        }
        int i;
        for (i = 0; i < A.length; i++){
            if (A[i] != i + 1)
                break;
        }
        return i + 1;
    }
}
```

[1]: https://oj.leetcode.com/problems/first-missing-positive/ "first-missing-positive"

