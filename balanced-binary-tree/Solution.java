/**
	leetcode - Balanced Binary Tree
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.15
*/
public class Solution {
    public boolean isBalanced(TreeNode root) {
        int h = getHeight(root);
        return h >= 0;
    }
    
    public int getHeight(TreeNode root){
        if (root == null) return 0;
        int h1 = getHeight(root.left);
        int h2 = getHeight(root.right);
        if (Math.abs(h1 - h2) <= 1 && h1 >=0 && h2 >= 0){
            return Math.max(h1, h2) + 1;
        }else{
            return -1;
        }
    }
}