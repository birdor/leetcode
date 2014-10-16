/**
	leetcode - Symmetric Tree
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.16
*/
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return mirror(root.left, root.right);
    }
    public boolean mirror(TreeNode l, TreeNode r){
        if (l == null || r == null) return l == r;
        return (l.val == r.val)? mirror(l.right, r.left) && mirror(l.left, r.right) : false;
    }
}