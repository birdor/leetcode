/**
	leetcode - Construct Binary Tree From Inorder And Postorder Traversal
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.21 
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return rootOf(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    private TreeNode rootOf(int[] inorder, int il, int ir, int[] postorder, int pl, int pr){
        if (pl >= pr){
            return null;
        }
        int n = pr - pl;
        TreeNode root = new TreeNode(postorder[pr - 1]);
        for (int i = il; i < ir; i++){
            if (inorder[i] == root.val){
                root.left = rootOf(inorder, il, i, postorder, pl, pl + i - il);
                root.right = rootOf(inorder, i + 1, ir, postorder, pr - ir + i, pr - 1);
                break;
            }
        }
        return root;
    }
}