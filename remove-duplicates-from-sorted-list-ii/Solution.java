/**
	leetcode - Remove Duplicates From Sorted List Ii
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.20
*/
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hook = new ListNode(0);
        hook.next = head;
        for (ListNode i = hook; i != null; i = i.next){
            while (i.next != null && i.next.next != null && i.next.val == i.next.next.val){
                int value = i.next.val;
                while (i.next != null && i.next.val == value)
                    i.next = i.next.next;
            }
        }
        return hook.next;
    }
}