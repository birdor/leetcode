## leetcode - Search For A Range
- Time: 2015.01.05
- Tags: divide and conquer

### Problem Description [link][1]
Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return `[-1, -1]`.

For example,
Given `[5, 7, 7, 8, 8, 10]` and target value 8,
return `[3, 4]`.

### Solution
```java
public class Solution {
    int indexBelowThresh(int thresh, int l, int r, int[] A){
        if (thresh < A[l]){
            return l - 1;
        }
        int m = l + (r - l) / 2;
        if (l == r){
            return l;
        }else if (A[m] <= thresh){
            return indexBelowThresh(thresh, m + 1, r, A);
        }
        return indexBelowThresh(thresh, l, m, A);
    }
    public int[] searchRange(int[] A, int target) {
        int[] ans = new int[2];
        ans[0] = indexBelowThresh(target - 1, 0, A.length - 1, A) + 1;
        ans[1] = indexBelowThresh(target, 0, A.length - 1, A);
        if (ans[0] > ans[1]){
            ans[0] = ans[1] = -1;
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/search-for-a-range/ "search-for-a-range"

