/**
	leetcode - Fake Maximum Root To Leaf Sum
	Time: 
	Space: 
	Completed:
*/
public class Solution {
    public int maxPathSum(TreeNode root) {
    	return (root == null) ? 0 : Math.max(maxPathSum(root.left), maxPathSum(root.right)) + root.val;
    }
}