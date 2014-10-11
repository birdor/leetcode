## leetcode - Merge Two Sorted Lists
- Time: 2014.09.27
- Tags: array and sort

### Problem Description [link][1]

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

### Solution

Just compare and move the point (reference).

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode hook = new ListNode(0);
        ListNode tail = hook;
        while (l1 != null || l2 != null){
        	if (l2 == null || l1 != null && l1.val < l2.val){
        		tail.next = l1;
        		l1 = l1.next;
        	}else{
        		tail.next = l2;
        		l2 = l2.next;
        	}
        	tail = tail.next;
        }
        return hook.next;
    }
}
```

[1]: https://oj.leetcode.com/problems/merge-two-sorted-lists/ "merge-two-sorted-lists"

