/**
	leetcode - Unique Binary Search Trees Ii
	Time: O(?)
	Space: O(?)
	Completed: 2015.2.2
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        ArrayList<List<TreeNode>> sub = new ArrayList<List<TreeNode>>(n + 1);
        List<TreeNode> empty = new LinkedList<TreeNode>();
        empty.add(null);
        sub.add(empty);
        for (int i = 1; i <= n; i++){
            LinkedList<TreeNode> samples = new LinkedList<TreeNode>();
            for (int k = 1; k <= i; k++){
                combine(samples, k, sub.get(k - 1), sub.get(i - k));
            }
            sub.add(samples);
        }
        return sub.get(n);
    }
    
    private void combine(List<TreeNode> samples, int k, List<TreeNode> left, List<TreeNode> right){
        for (TreeNode l : left){
            for (TreeNode r : right){
                TreeNode root = new TreeNode(k);
                root.left = copyTree(l, 0);
                root.right = copyTree(r, k);
                samples.add(root);
            }
        }
    }
    
    private TreeNode copyTree(TreeNode x, int offset){
        if (x != null){
            TreeNode y = new TreeNode(x.val + offset);
            y.left = copyTree(x.left, offset);
            y.right = copyTree(x.right, offset);
            return y;
        }
        return null;
    }
}