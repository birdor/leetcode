/**
	leetcode - Sum Root To Leaf Numbers
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