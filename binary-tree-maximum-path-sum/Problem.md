## leetcode - Binary Tree Maximum Path Sum
- Time: 2014.11.05
- Tags: greedy, tree

### Problem Description [link][1]
Given a binary tree, find the maximum path sum.

The path may start and end at any node in the tree.

For example:
Given the below binary tree,
```
       1
      / \
     2   3
```
Return `6`.

### Solution
```java
public class Solution {
    int ans = 0;
    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        ans = -Integer.MIN_VALUE;
        maxSingleSum(root);
        return ans;
    }
    public int maxSingleSum(TreeNode root) {
        if (root == null)
            return 0;
        int leftSum = Math.max(0, maxSingleSum(root.left));
        int rightSum = Math.max(0, maxSingleSum(root.right));
        ans = Math.max(ans, leftSum + rightSum + root.val);
        return Math.max(leftSum, rightSum) + root.val;
    }
}
```

[1]: https://oj.leetcode.com/problems/binary-tree-maximum-path-sum/ "binary-tree-maximum-path-sum"

