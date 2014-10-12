/**
	leetcode - Recover Binary Search Tree
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.11
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

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