/**
	leetcode - Linked List Cycle Ii
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.7
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        for (ListNode i1 = head, i2 = head; i2 != null && i2.next != null;){
            i1 = i1.next;
            i2 = i2.next.next;
            if (i1 == i2){
                for (i2 = head; i1 != i2; i1 = i1.next, i2 = i2.next);
                return i1;
            }
        }
        return null;
    }
}