/**
	leetcode - Path Sum
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.16
*/
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return sum == root.val;
        return root.left != null && hasPathSum(root.left, sum - root.val) 
            || root.right != null && hasPathSum(root.right, sum - root.val);
    }
}