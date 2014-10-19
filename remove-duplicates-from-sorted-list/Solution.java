/**
	leetcode - Remove Duplicates From Sorted List
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.19
*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        for (ListNode i = head; i != null; i = i.next){
            while (i.next != null && i.next.val == i.val)
                i.next = i.next.next;
        }
        return head;
    }
}