## leetcode - Validate Binary Search Tree
- Time: 2014.10.22
- Tags: tree

### Problem Description [link][1]
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.


### Solution
```java
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean checkValid(TreeNode x, int l, int r){
        return x == null || l < x.val && x.val < r && checkValid(x.left, l, x.val) && checkValid(x.right, x.val, r);
    }
}
```

[1]: https://oj.leetcode.com/problems/validate-binary-search-tree/ "validate-binary-search-tree"

