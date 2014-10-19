## leetcode - Subsets
- Time: 2014.10.19
- Tags: bit operation

### Problem Description [link][1]
Given a set of distinct integers, S, return all possible subsets.

Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
For example,
If `S = [1,2,3]`, a solution is:

```
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
```

### Solution
```java
import java.util.Arrays;
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(S);
        int N = S.length;
        for (int bits = 0; bits < (1 << N); bits++){
            ArrayList<Integer> subset = new ArrayList<Integer>();
            for (int i = 0; i < N; i++){
                if (((bits >> i) & 1) > 0){
                    subset.add(S[i]);
                }
            }
            subsets.add(subset);
        }
        return subsets;
    }
}
```

[1]: https://oj.leetcode.com/problems/subsets/ "subsets"

