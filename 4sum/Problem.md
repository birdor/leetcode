## leetcode - 4sum
- Time: 2014.11.07
- Tags: array, combination

### Problem Description [link][1]
Given an array S of n integers, are there elements a, b, c, and d in S such that `a + b + c + d = target`? Find all unique quadruplets in the array which gives the sum of target.

Note:
Elements in a quadruplet `(a,b,c,d)` must be in non-descending order. (ie, `a ≤ b ≤ c ≤ d`)
The solution set must not contain duplicate quadruplets.

For example, given array `S = {1 0 -1 0 -2 2}`, and `target = 0`.
A solution set is:
```
    (-1,  0, 0, 1)
    (-2, -1, 1, 2)
    (-2,  0, 0, 2)
```

### Solution
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++){
            if (i > 0 && num[i] == num[i - 1])
                continue;
            for (int j = i + 1; j < num.length; j++){
                if (j > i + 1 && num[j] == num[j - 1])
                    continue;
                int r = num.length - 1;
                for (int l = j + 1; l < r; l++){
                    if (l > j + 1 && num[l] == num[l - 1])
                        continue;
                    while (l < r && num[i] + num[j] + num[l] + num[r] > target){
                        r--;
                    }
                    if (l < r && num[i] + num[j] + num[l] + num[r] == target){
                        ans.add(combination(num[i], num[j], num[l], num[r]));
                    }
                }
            }
        }
        return ans;
    }
    private ArrayList<Integer> combination(int a, int b, int c, int d){
        ArrayList<Integer> list = new ArrayList<Integer>(4);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        return list;
    }
}
```

[1]: https://oj.leetcode.com/problems/4sum/ "4sum"

