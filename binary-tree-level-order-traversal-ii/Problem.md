## leetcode - Binary Tree Level Order Traversal Ii
- Time: 2015.01.12
- Tags: tree, linked list

### Problem Description [link][1]
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree `{3,9,20,#,#,15,7}`,
```
    3
   / \
  9  20
    /  \
   15   7
```
return its bottom-up level order traversal as:
```
[
  [15,7],
  [9,20],
  [3]
]
```

### Solution
```java
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root); 
        int numThisLayer = 0, numNextLayer = 1;
        while(!queue.isEmpty()){
            if (numThisLayer == 0){
                numThisLayer = numNextLayer;
                numNextLayer = 0;
                ans.addFirst(new LinkedList<Integer>());
            }
            TreeNode x = queue.poll();
            numThisLayer--;
            if (x != null){
                ans.getFirst().add(x.val);
                queue.add(x.left);
                queue.add(x.right);
                numNextLayer += 2;
            }
        }
        if (ans.getFirst().isEmpty()){
            ans.removeFirst();
        }
        return ans;
    }
}
```

[1]: https://oj.leetcode.com/problems/binary-tree-level-order-traversal-ii/ "binary-tree-level-order-traversal-ii"

