## leetcode - Same Tree
- Time: 2014.10.16
- Tags: tree

### Problem Description [link][1]
Given two binary trees, write a function to check if they are equal or not.

Two binary trees are considered equal if they are structurally identical and the nodes have the same value.


### Solution
```java
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
```

[1]: https://oj.leetcode.com/problems/same-tree/ "same-tree"

