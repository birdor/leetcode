## leetcode - Remove Element
- Time: 2014.09.22
- Tags: warmup, arrays and sorting


### Problem Description [link][1]

Given an array and a value, remove all instances of that value in place and return the new length.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

### Solution

```java
public class Solution {
    public int removeElement(int[] A, int elem) {
        int j = 0;
        for (int i = 0; i < A.length; ++i)
            if (A[i] != elem) A[j++] = A[i];
        return j;
    }
}
```

[1]: https://oj.leetcode.com/problems/remove-element/ "remove-element"