## leetcode - Sum Root To Leaf Numbers
- Time: 2014.10.12
- Tags: 

### Problem Description [link][1]
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,
```
    1
   / \
  2   3
```
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.


### Solution
Traverse the tree and record the path. Add the r2l number to the sum when reaching a leaf.

```java
public class Solution{
    public int sumNumbers(TreeNode root){
    	return traverse(root, 0);
    }
    private int traverse(TreeNode node, int r2l){
    	if (node == null) return 0;
    	r2l = r2l * 10 + node.val;
    	return (node.left == null && node.right == null) ? 
    		r2l : traverse(node.left, r2l) + traverse(node.right, r2l);
    }
}
```

[1]: https://oj.leetcode.com/problems/sum-root-to-leaf-numbers/ "sum-root-to-leaf-numbers"

