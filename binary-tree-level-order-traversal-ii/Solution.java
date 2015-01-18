/**
	leetcode - Binary Tree Level Order Traversal Ii
	Time: O(n)
	Space: O(n)
	Completed: 2015.1.12
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root); 
        int numThisLayer = 0, numNextLayer = 1;
        while(!queue.isEmpty()){
            if (numThisLayer == 0){
                numThisLayer = numNextLayer;
                numNextLayer = 0;
                ans.addFirst(new LinkedList<Integer>());
            }
            TreeNode x = queue.poll();
            numThisLayer--;
            if (x != null){
                ans.getFirst().add(x.val);
                queue.add(x.left);
                queue.add(x.right);
                numNextLayer += 2;
            }
        }
        if (ans.getFirst().isEmpty()){
            ans.removeFirst();
        }
        return ans;
    }
}