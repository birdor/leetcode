/**
	leetcode - Symmetric Tree
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.16
*/
public class Solution0 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> q = new LinkedList();
        q.add(root.left);
        q.add(root.right);
        while (q.size() > 0){
            TreeNode l = q.pollFirst();
            TreeNode r = q.pollFirst();
            if (l == null || r == null){
                if (l != r) return false;
            }else{
                if (l.val != r.val) return false;
                q.add(l.left);
                q.add(r.right);
                q.add(l.right);
                q.add(r.left);
            }
        }
        return true;
    }
}