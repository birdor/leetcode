## leetcode - Remove Duplicates From Sorted Array Ii
- Time: 2014.10.30
- Tags: array

### Problem Description [link][1]
Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array `A = [1,1,1,2,2,3]`,

Your function should return length = `5`, and A is now `[1,1,2,2,3]`.

### Solution
```java
public class Solution {
    public int removeDuplicates(int[] A) {
        if (A.length == 0){
            return A.length;
        }
        int count = 1;
        int len = 1;
        for (int i = 1; i < A.length; i++){
            count = (A[i] == A[i - 1])? count + 1 : 1;
            if (count <= 2){
                A[len++] = A[i];
            }
        }
        return len;
    }
}
```

[1]: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array-ii/ "remove-duplicates-from-sorted-array-ii"

