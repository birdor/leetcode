## leetcode - Unique Binary Search Trees
- Time: 2014.11.07
- Tags: dynamic programming, tree

### Problem Description [link][1]
Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

```
   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```

### Solution
```java
public class Solution {
    public int numTrees(int n) {
        int[] sum = new int[n + 1];
        sum[0] = 1;
        for (int i = 0; i <= n; i++){
            for (int j = 0; j < i; j++){
                sum[i] += sum[j] * sum[i - 1 - j];
            }
        }
        return sum[n];
    }
}
```

[1]: https://oj.leetcode.com/problems/unique-binary-search-trees/ "unique-binary-search-trees"

