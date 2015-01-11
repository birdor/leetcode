## leetcode - Binary Tree Level Order Traversal
- Time: 2014.11.09
- Tags: tree

### Problem Description [link][1]
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree `{3,9,20,#,#,15,7}`,
```
    3
   / \
  9  20
    /  \
   15   7
```
return its level order traversal as:
```
[
  [3],
  [9,20],
  [15,7]
]
```

### Solution
```java
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null)
            return ans;
        ans.add(new ArrayList<Integer>());
        queue.add(root);
        int n0 = 1, n1 = 0;
        while (n0 > 0){
            TreeNode t = queue.poll();
            n0--;
            ans.get(ans.size() - 1).add(t.val);
            if (t.left != null){
                queue.add(t.left);
                n1++;
            }
            if (t.right != null){
                queue.add(t.right);
                n1++;
            }
            if (n0 == 0){
                n0 = n1;
                n1 = 0;
                if (n0 > 0){
                    ans.add(new ArrayList<Integer>());
                }
            }
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/binary-tree-level-order-traversal/ "binary-tree-level-order-traversal"

