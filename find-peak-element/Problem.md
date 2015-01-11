## leetcode - Find Peak Element
- Time: 2014.12.10
- Tags: divide and conquer

### Problem Description [link][1]
A peak element is an element that is greater than its neighbors.

Given an input array where `num[i] ≠ num[i+1]`, find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that `num[-1] = num[n] = -∞`.

For example, in array `[1, 2, 3, 1]`, 3 is a peak element and your function should return the index number 2.

### Solution
```java
public class Solution {
    public int findPeakElement(int[] num) {
        int l = 0, r = num.length - 1;
        while (l < r){
            int k = l + (r - l) / 2;
            if (val(num, k) > val(num, k + 1)){
                if (val(num, k - 1) < val(num, k)){
                    return k;
                }else{
                    r = k;
                }
            }else{
                l = k + 1;
            }
        }
        return l;
    }
    int val(int[] num, int i){
        return (i >= 0 && i < num.length) ? num[i] : Integer.MIN_VALUE;
    }
}
```

[1]: https://oj.leetcode.com/problems/find-peak-element/ "find-peak-element"

