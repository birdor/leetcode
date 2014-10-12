## leetcode - Recover Binary Search Tree
- Time: 2014.10.01
- Tags: 

### Problem Description [link][1]
Two elements of a binary search tree (BST) are swapped by mistake.

Recover the tree without changing its structure.

Note:
A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?


### Solution
First, traverse the tree and build the inorder traversal. 
Second, iterate the traversal and find the successive nodes with decreasing values. 

If there are two pairs of such nodes and suppose they are A > B and C > D, the switched nodes are A and D.

If there are only one pairs of such nodes, the switched nodes are them.

```java
import java.util.ArrayList;

public class Solution {
    public void recoverTree(TreeNode root) {
		ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
		traverse(root, nodes);
		TreeNode left = null, right = null;
		boolean found = false;
		for (int i = 1; i < nodes.size(); i++){
			if (!found && nodes.get(i - 1).val > nodes.get(i).val){
				found = true;
				left = nodes.get(i - 1);
			}
			if (found && nodes.get(i - 1).val > nodes.get(i).val)
				right = nodes.get(i);
		}
		int tmp = left.val;
		left.val = right.val;
		right.val = tmp;
    }
    private void traverse(TreeNode x, ArrayList<TreeNode> nodes){
    	if (x == null) return;
    	traverse(x.left, nodes);
    	nodes.add(x);
    	traverse(x.right, nodes);
    }
}
```

To avoid using O(n) space, the traverse function can be modified to detect the inversed pairs directly.

In the following solution, the space usage is O(1).

```java
public class Solution0 {
	private boolean found = false;
	private TreeNode left = null, right = null, lastnode = null;
    public void recoverTree(TreeNode root) {
    	found = false;
    	left = right = lastnode = null;
    	traverse(root);
    	int tmp = left.val;
    	left.val = right.val;
    	right.val = tmp;
    }
    private void traverse(TreeNode x){
    	if (x == null) return;
    	traverse(x.left);
    	if (lastnode != null && !found && lastnode.val > x.val){
    		found = true;
    		left = lastnode;
    	}
    	if (lastnode != null && found && lastnode.val > x.val){
    		right = x;
    	}
    	lastnode = x;
    	traverse(x.right);
    }
}
```

[1]: https://oj.leetcode.com/problems/recover-binary-search-tree/ "recover-binary-search-tree"

