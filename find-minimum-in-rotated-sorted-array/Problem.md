## leetcode - Find Minimum In Rotated Sorted Array
- Time: 2014.10.20
- Tags: divede and conquer, array

### Problem Description [link][1]
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., `0 1 2 4 5 6 7` might become `4 5 6 7 0 1 2`).

Find the minimum element.

You may assume no duplicate exists in the array.

### Solution
```java
public class Solution {
    public int findMin(int[] num) {
        return lookForMin(num, 0, num.length - 1);
    }
    private int lookForMin(int[] num, int l, int r){
        if (num[l] <= num[r])
            return num[l];
        int m = l + (r - l) / 2;
        if (num[m] > num[r])
            return lookForMin(num, m + 1, r);
        else
            return lookForMin(num, l, m);
    }
}
```

[1]: https://oj.leetcode.com/problems/find-minimum-in-rotated-sorted-array/ "find-minimum-in-rotated-sorted-array"

