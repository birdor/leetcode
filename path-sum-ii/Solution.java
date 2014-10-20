/**
	leetcode - Path Sum Ii
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.20
*/
import java.util.*;
public class Solution {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> stack = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        traverse(root, stack, ans, sum, 0);
        return ans;
    }
    public void traverse(TreeNode root, ArrayList<Integer> stack, ArrayList<ArrayList<Integer>> ans, int sum, int balance){
        if (root == null) return;
        balance += root.val;
        stack.add(root.val);
        if (balance == sum && root.left == null && root.right == null)
            ans.add((ArrayList) stack.clone());
        traverse(root.left, stack, ans, sum, balance);
        traverse(root.right, stack, ans, sum, balance);
        stack.remove(stack.size() - 1);
    }
}