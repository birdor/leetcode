/**
	leetcode - Partition List
	Time: O(n)
	Space: O(1)
	Completed: 2014.11.14
*/

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode hook1 = new ListNode(0), tail1 = hook1;
        ListNode hook2 = new ListNode(0), tail2 = hook2;
        for (ListNode i = head; i != null; i = i.next){
            if (i.val < x){
                tail1.next = i;
                tail1 = i;
            }else{
                tail2.next = i;
                tail2 = i;
            }
        }
        tail1.next = hook2.next;
        tail2.next = null;
        return hook1.next;
    }
}