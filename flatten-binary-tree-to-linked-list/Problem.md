## leetcode - Flatten Binary Tree To Linked List
- Time: 2014.11.04
- Tags: tree

### Problem Description [link][1]
Given a binary tree, flatten it to a linked list in-place.

For example,
Given
```
         1
        / \
       2   5
      / \   \
     3   4   6
```
The flattened tree should look like:
```
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
```
### Solution
```java
public class Solution {
    public void flatten(TreeNode root) {
        hang(root);
    }
    private TreeNode hang(TreeNode root){
        if (root == null) 
            return null;
        TreeNode leftend = hang(root.left);
        TreeNode rightend = hang(root.right);
        if (leftend != null){
            leftend.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (rightend != null) 
            return rightend;
        if (leftend != null)
            return leftend;
        return root;
    }
}
```

[1]: https://oj.leetcode.com/problems/flatten-binary-tree-to-linked-list/ "flatten-binary-tree-to-linked-list"

