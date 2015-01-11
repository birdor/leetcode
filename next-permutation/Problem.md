## leetcode - Next Permutation
- Time: 2015.01.06
- Tags: combination

### Problem Description [link][1]
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
```
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
```

### Solution
```java
public class Solution {
    public void nextPermutation(int[] num) {
        int t = num.length - 1;
        for (; t > 0 && num[t - 1] >= num[t]; t--);
        if (t > 0){
            int k = t;
            for (int i = k; i < num.length && num[i] > num[t - 1]; i++){
                k = i;
            }
            swap(num, t - 1, k);
        }
        for (int i = t, j = num.length - 1; i < j; i++, j--){
            swap(num, i, j);
        }
    }
    public void swap(int[] num, int i, int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }
}
```

[1]: https://oj.leetcode.com/problems/next-permutation/ "next-permutation"

