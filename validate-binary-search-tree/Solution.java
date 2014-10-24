/**
	leetcode - Validate Binary Search Tree
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.22
*/
public class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private boolean checkValid(TreeNode x, int l, int r){
        return x == null || l < x.val && x.val < r && checkValid(x.left, l, x.val) && checkValid(x.right, x.val, r);
    }
}