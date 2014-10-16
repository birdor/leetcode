## leetcode - Symmetric Tree
- Time: 2014.10.16
- Tags: tree

### Problem Description [link][1]
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```
But the following is not:
```
    1
   / \
  2   2
   \   \
   3    3
```
Note:
Bonus points if you could solve it both recursively and iteratively.

### Solution
Do it recursively:
```java
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return mirror(root.left, root.right);
    }
    public boolean mirror(TreeNode l, TreeNode r){
        if (l == null || r == null) return l == r;
        return (l.val == r.val)? mirror(l.right, r.left) && mirror(l.left, r.right) : false;
    }
}
```

Do it iteratively:
```java
public class Solution0 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> q = new LinkedList();
        q.add(root.left);
        q.add(root.right);
        while (q.size() > 0){
            TreeNode l = q.pollFirst();
            TreeNode r = q.pollFirst();
            if (l == null || r == null){
                if (l != r) return false;
            }else{
                if (l.val != r.val) return false;
                q.add(l.left);
                q.add(r.right);
                q.add(l.right);
                q.add(r.left);
            }
        }
        return true;
    }
}
```

[1]: https://oj.leetcode.com/problems/symmetric-tree/ "symmetric-tree"

