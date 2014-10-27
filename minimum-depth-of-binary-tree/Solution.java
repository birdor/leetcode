/**
	leetcode - Minimum Depth Of Binary Tree
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.27
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
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null)
            minDepth = Math.min(minDepth, minDepth(root.left) + 1);
        if (root.right != null)
            minDepth = Math.min(minDepth, minDepth(root.right) + 1);
        return minDepth;
    }
}