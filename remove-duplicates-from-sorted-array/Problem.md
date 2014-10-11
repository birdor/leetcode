## leetcode - Remove Duplicates From Sorted Array
- Time: 2014.09.22
- Tags: warmup, arrays and sorting

### Problem Description [link][1]

Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array A = `[1,1,2]`,

Your function should return length = `2`, and A is now `[1,2]`.


### Solution

```java
public class Solution {
    public static int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;
        int j = 1;
        for (int i = 1; i < A.length; ++i)
            if (A[i] != A[i - 1]) A[j++] = A[i];                
        return j;
    }
}
```

[1]: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/ "remove-duplicates-from-sorted-array"