/**
	leetcode - Convert Sorted List To Binary Search Tree
	Time: O(nlogn)
	Space: O(logn)
	Completed: 2014.11.03
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
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
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        int n = 0;
        for (ListNode inode = head; inode != null; inode = inode.next)
            n++;
        if (n == 1)
            return new TreeNode(head.val);
        ListNode leftHead = head, rightHead, inode = head;
        for (int i = 1; i < n / 2; i++)
            inode = inode.next;
        TreeNode root = new TreeNode(inode.next.val);
        rightHead = inode.next.next;
        inode.next = null;
        root.left = sortedListToBST(leftHead);
        root.right = sortedListToBST(rightHead);
        return root;
    }
}