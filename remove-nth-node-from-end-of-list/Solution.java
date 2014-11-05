/**
	leetcode - Remove Nth Node From End Of List
	Time: 
	Space: 
	Completed:
*/
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fakehead = new ListNode(0);
        fakehead.next = head;
        ListNode stalker = null;
        int counter = 0;
        for (ListNode i = head; i != null; i = i.next){
            counter++;
            if (counter == n){
                stalker = fakehead;
            }
            if (counter > n){
                stalker = stalker.next;
            }
        }
        stalker.next = stalker.next.next;
        return fakehead.next;
    }
}