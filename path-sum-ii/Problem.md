## leetcode - Path Sum Ii
- Time: 2014.10.20
- Tags: tree

### Problem Description [link][1]
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

For example:
Given the below binary tree and `sum = 22`,
```
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
```
return
```
[
   [5,4,11,2],
   [5,8,4,5]
]
```

### Solution
The primary BUG before AC is: `ans.add(stack);`

It adds the reference of `stack` into `ans`, whereas `stack` may change later. This leads to that the `ans` is always a collection of empty arrays.

```java
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        traverse(root, stack, ans, sum, 0);
        return ans;
    }
    public void traverse(TreeNode root, ArrayList<Integer> stack, ArrayList<ArrayList<Integer>> ans, int sum, int balance){
        if (root == null) return;
        balance += root.val;
        stack.add(root.val);
        if (balance == sum && root.left == null && root.right == null)
            ans.add((ArrayList) stack.clone());
        traverse(root.left, stack, ans, sum, balance);
        traverse(root.right, stack, ans, sum, balance);
        stack.remove(stack.size() - 1);
    }
}
```

[1]: https://oj.leetcode.com/problems/path-sum-ii/ "path-sum-ii"

