## leetcode - Maximum Depth Of Binary Tree
- Time: 2014.10.19
- Tags: tree

### Problem Description [link][1]
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Solution
```java
public class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
```

[1]: https://oj.leetcode.com/problems/maximum-depth-of-binary-tree/ "maximum-depth-of-binary-tree"

