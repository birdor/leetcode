## leetcode - Binary Tree Inorder Traversal
- Time: 2014.10.21
- Tags: hard, tree, stack

### Problem Description [link][1]
Given a binary tree, return the inorder traversal of its nodes' values.

For example:
Given binary tree `{1,#,2,3}`,
```
   1
    \
     2
    /
   3
```
return `[1,3,2]`.

Note: Recursive solution is trivial, could you do it iteratively?

### Solution
```java
import java.util.*;
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        ArrayList<Integer> seq = new ArrayList<Integer>();
        stack.push(root);
        TreeNode n, last = root;
        if (root == null)
            return seq;
        while (stack.size() > 0){
            n = stack.peek();
            if (last == n && n.left != null){
            	last = n.left;
            	stack.push(n.left);
            	continue;
            }
            if (last == n.left || last == n && n.left == null)
            	seq.add(stack.peek().val);
            if ((last == n.left || last == n && n.left == null) && n.right != null){
            	last = n.right;
            	stack.push(n.right);
            	continue;
            }
            last = stack.pop();
        }
        return seq;
    }
}
```

[1]: https://oj.leetcode.com/problems/binary-tree-inorder-traversal/ "binary-tree-inorder-traversal"

