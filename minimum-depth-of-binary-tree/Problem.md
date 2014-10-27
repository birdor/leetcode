## leetcode - Minimum Depth Of Binary Tree
- Time: 2014.10.27
- Tags: tree

### Problem Description [link][1]

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

### Solution
```java
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null)
            minDepth = Math.min(minDepth, minDepth(root.left) + 1);
        if (root.right != null)
            minDepth = Math.min(minDepth, minDepth(root.right) + 1);
        return minDepth;
    }
}
```

[1]: https://oj.leetcode.com/problems/minimum-depth-of-binary-tree/ "minimum-depth-of-binary-tree"

