/**
	leetcode - Recover Binary Search Tree
	Time: 
	Space: 
	Completed:
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