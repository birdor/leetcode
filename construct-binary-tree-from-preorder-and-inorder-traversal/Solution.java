/**
	leetcode - Construct Binary Tree From Preorder And Inorder Traversal
	Time: O(n)
	Space: O(n)
	Completed: 2015.1.18
*/
public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return rootOf(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    private TreeNode rootOf(int[] preorder, int lp, int rp, int[] inorder, int li, int ri){
        int size = rp - lp;
        if (size <= 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[lp]);
        int ki;
        for (ki = li; ki < ri && inorder[ki] != preorder[lp]; ki++);
        int lsize = ki - li, rsize = size - 1 - lsize;
        root.left = rootOf(preorder, lp + 1, lp + 1 + lsize, inorder, li, li + lsize);
        root.right = rootOf(preorder, rp - rsize, rp, inorder, ri - rsize, ri);
        return root;
    }
}