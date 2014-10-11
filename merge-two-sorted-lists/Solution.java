/**
	leetcode - Merge Two Sorted Lists
	Time: O(n)
	Space: O(n)
	Completed: 2014.09.24
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

