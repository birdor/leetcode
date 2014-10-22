/**
	leetcode - Binary Tree Inorder Traversal
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.21
*/
import java.util.*;
public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        ArrayList<Integer> seq = new ArrayList<Integer>();
        stack.push(root);
        TreeNode n, last = root;
        if (root == null)
            return seq;
        while (stack.size() > 0){
            n = stack.peek();
            if (last == n && n.left != null){
            	last = n.left;
            	stack.push(n.left);
            	continue;
            }
            if (last == n.left || last == n && n.left == null)
            	seq.add(stack.peek().val);
            if ((last == n.left || last == n && n.left == null) && n.right != null){
            	last = n.right;
            	stack.push(n.right);
            	continue;
            }
            last = stack.pop();
        }
        return seq;
    }
}