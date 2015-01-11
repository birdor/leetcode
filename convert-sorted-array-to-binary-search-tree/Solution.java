/**
	leetcode - Convert Sorted Array To Binary Search Tree
	Time: O(n)
	Space: O(h)
	Completed: 2015.1.10
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
    public TreeNode sortedArrayToBST(int[] num) {
        return construct(num, 0, num.length - 1);
    }
    
    private TreeNode construct(int[] num, int l, int r){
        if (l > r){
            return null;
        }else{
            int mid = l + (r - l)/2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = construct(num, l, mid - 1);
            root.right = construct(num, mid + 1, r);
            return root;
        }
    }
}