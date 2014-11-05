## leetcode - Convert Sorted List To Binary Search Tree
- Time: 2014.11.03
- Tags: linked list, tree

### Problem Description [link][1]
Given a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/convert-sorted-list-to-binary-search-tree/ "convert-sorted-list-to-binary-search-tree"

