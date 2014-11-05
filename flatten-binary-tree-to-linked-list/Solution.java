/**
	leetcode - Flatten Binary Tree To Linked List
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.04
*/
public class Solution {
    public void flatten(TreeNode root) {
        hang(root);
    }
    private TreeNode hang(TreeNode root){
        if (root == null) 
            return null;
        TreeNode leftend = hang(root.left);
        TreeNode rightend = hang(root.right);
        if (leftend != null){
            leftend.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        if (rightend != null) 
            return rightend;
        if (leftend != null)
            return leftend;
        return root;
    }
}