/**
	leetcode - Reverse Linked List Ii
	Time: O(n)
	Space: O(1)
	Completed: 2014.11.03
*/
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode hook = new ListNode(0);
        hook.next = head;
        ListNode bp = null;
        int id = 0;
        for (ListNode i = hook, j = i.next; j != null; ){
            id++;
            if (id == m)
                bp = i;
            if (id == n){
                bp.next.next = j.next;
                bp.next = j;
            }
            if (id > m && id <= n){
                ListNode tmp = j.next;
                j.next = i;
                i = j;
                j = tmp;
            }else{
                i = j;
                j = i.next;
            }
        }
        return hook.next;
    }
}