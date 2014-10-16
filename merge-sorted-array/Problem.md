## leetcode - Merge Sorted Array
- Time: 2014.10.16
- Tags: 

### Problem Description [link][1]
Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note:
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.

### Solution
```java
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        for (int i = m - 1; i >= 0; i--){
            A[i + n] = A[i];
        }
        for (int i = 0, j = 0, k = 0; i < m || j < n; k++){
            if (i == m || j < n && B[j] < A[i + n]){
                A[k] = B[j];
                j++;
            }else{
                A[k] = A[i + n];
                i++;
            }
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/merge-sorted-array/ "merge-sorted-array"

