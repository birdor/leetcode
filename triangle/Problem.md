## leetcode - Triangle
- Time: 2014.10.24
- Tags: 

### Problem Description [link][1]
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

For example, given the following triangle
```
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
```
The minimum path sum from top to bottom is 11 (i.e., `2 + 3 + 5 + 1 = 11`).


### Solution
```java
import java.util.*;
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] sum = new int[n];
        for (int i = 0; i < n; i++){
            if (i > 0)
                sum[i] = triangle.get(i).get(i) + sum[i - 1];
            for (int j = i - 1; j > 0; j--){
                sum[j] = Math.min(sum[j - 1], sum[j]) + triangle.get(i).get(j);
            }
            sum[0] = sum[0] + triangle.get(i).get(0);
        }
        int ans = Integer.MAX_VALUE;
        for (int s : sum)
            ans = Math.min(ans, s);
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/triangle/ "triangle"

