## leetcode - Balanced Binary Tree
- Time: 2014.10.15
- Tags: tree

### Problem Description [link][1]
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

### Solution
```java
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int h = getHeight(root);
        return h >= 0;
    }
    
    public int getHeight(TreeNode root){
        if (root == null) return 0;
        int h1 = getHeight(root.left);
        int h2 = getHeight(root.right);
        if (Math.abs(h1 - h2) <= 1 && h1 >=0 && h2 >= 0){
            return Math.max(h1, h2) + 1;
        }else{
            return -1;
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/balanced-binary-tree/ "balanced-binary-tree"

