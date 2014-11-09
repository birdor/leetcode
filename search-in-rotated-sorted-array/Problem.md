## leetcode - Search In Rotated Sorted Array
- Time: 2014.11.05
- Tags: divide and conquer, array

### Problem Description [link][1]
Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., `0 1 2 4 5 6 7` might become `4 5 6 7 0 1 2`).

You are given a target value to search. If found in the array return its index, otherwise return `-1`.

You may assume no duplicate exists in the array.

### Solution
```java
public class Solution {
    public int search(int[] A, int target) {
        return (A.length == 0)? -1 : binarySearch(A, target, 0, A.length - 1);
    }
    private int binarySearch(int[] A, int target, int l, int r){
        if (l == r)
            return (A[l] == target) ? l : -1;
        int m = l + (r - l) / 2;
        if (A[l] <= A[m] && target >= A[l] && target <= A[m] || A[l] > A[m] && (target < A[m + 1] || target > A[r])){
            return binarySearch(A, target, l, m);
        }else{
            return binarySearch(A, target, m + 1, r);
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/search-in-rotated-sorted-array/ "search-in-rotated-sorted-array"

