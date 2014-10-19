/**
	leetcode - Swap Nodes In Pairs
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.19
*/
public class Solution{
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode i = head, j = head.next, k = head.next.next;
        j.next = i;
        i.next = swapPairs(k);
        return j;
    }
}