/**
	leetcode - Reverse Nodes In K Group
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.16
*/
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1){
            return head;
        }
        ListNode anchor = new ListNode(0);
        anchor.next = head;
        outloop: 
        for (ListNode before = anchor, before2; before != null; before = before2){
            ListNode after = before.next;
            for (int i = 0; i < k; i++){
                if (after != null){
                    after = after.next;
                }else{
                    break outloop;
                }
            }
            before2 = before.next;
            ListNode pre = after; 
            for (ListNode x = before2, x2; x != after; x = x2){
                x2 = x.next;
                x.next = pre;
                pre = x;
            }
            before.next = pre;
        }
        return anchor.next;
    }
}