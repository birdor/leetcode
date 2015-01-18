/**
	leetcode - Sort List
	Time: O(nlogn)
	Space: O(n)
	Completed: 2015.1.17
*/
public class Solution {
    ListNode anchor = new ListNode(0);
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null){
            slow = move(slow);
            fast = move(move(fast));
        }
        ListNode L = head, R = slow.next;
        slow.next = null;
        L = sortList(L);
        R = sortList(R);
        return merge(L, R);
    }
    private ListNode move(ListNode x){
        return (x != null)? x.next : null;
    }
    private ListNode merge(ListNode L, ListNode R){
        anchor.next = null;
        for (ListNode x = anchor; x != null; x = move(x)){
            if (L != null && (R == null || L.val < R.val)){
                x.next = L;
                L = move(L);
            }else{
                x.next = R;
                R = move(R);
            }
        }
        return anchor.next;
    }
}