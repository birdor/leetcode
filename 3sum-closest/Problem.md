## leetcode - 3sum Closest
- Time: 2015.01.18
- Tags: array

### Problem Description [link][1]
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

    For example, given array S = `{-1 2 1 -4}`, and target = `1`.

    The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

### Solution
```java
public class Solution {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int n = num.length, ans = num[0] + num[1] + num[2];
        for (int i = 2; i < n; i++){
            int k = i - 1;
            for (int j = 0; j < k; j++){
                ans = update(target, ans, num[i] + num[j] + num[k]);
                while (j < k && num[i] + num[j] + num[k] > target){
                    if (j < --k){
                        ans = update(target, ans, num[i] + num[j] + num[k]);
                    }
                }
            }
        }
        return ans;
    }
    private int update(int target, int ans, int choice){
        return (Math.abs(target - ans) < Math.abs(target - choice))? ans : choice;
    }
}
```

[1]: https://oj.leetcode.com/problems/3sum-closest/ "3sum-closest"

