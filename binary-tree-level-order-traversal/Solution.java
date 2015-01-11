/**
	leetcode - Binary Tree Level Order Traversal
	Time: O(n)
	Space: O(n)
	Completed: 2014.11.09
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null)
            return ans;
        ans.add(new ArrayList<Integer>());
        queue.add(root);
        int n0 = 1, n1 = 0;
        while (n0 > 0){
            TreeNode t = queue.poll();
            n0--;
            ans.get(ans.size() - 1).add(t.val);
            if (t.left != null){
                queue.add(t.left);
                n1++;
            }
            if (t.right != null){
                queue.add(t.right);
                n1++;
            }
            if (n0 == 0){
                n0 = n1;
                n1 = 0;
                if (n0 > 0){
                    ans.add(new ArrayList<Integer>());
                }
            }
        }
        return ans;
    }
}