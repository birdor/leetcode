/**
	leetcode - Binary Tree Maximum Path Sum
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.05
*/
public class Solution {
    int ans = 0;
    public int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        ans = -Integer.MIN_VALUE;
        maxSingleSum(root);
        return ans;
    }
    public int maxSingleSum(TreeNode root) {
        if (root == null)
            return 0;
        int leftSum = Math.max(0, maxSingleSum(root.left));
        int rightSum = Math.max(0, maxSingleSum(root.right));
        ans = Math.max(ans, leftSum + rightSum + root.val);
        return Math.max(leftSum, rightSum) + root.val;
    }
}