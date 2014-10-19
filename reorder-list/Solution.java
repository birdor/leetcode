/**
	leetcode - Reorder List
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.19
*/
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head){
        if (head == null || head.next == null)
            return;
        ListNode head1 = head, head2 = secondHalf(head);
        head2 = reverseOrder(head2);
        head = merge(head1, head2);
    }
    private ListNode secondHalf(ListNode head){
        if (head == null) return null;
        int num = 1;
        for (ListNode i = head; i.next != null; i = i.next){
            num++;
        }
        int count = 1;
        for (ListNode i = head; i.next != null; i = i.next){
            if (count == num / 2){
                ListNode j = i.next;
                i.next = null;
                return j;
            }
            count++;
        }
        return null;
    }
    private ListNode reverseOrder(ListNode h){
        ListNode i = null, j = h, k = null;
        while (j != null){
            k = j.next;
            j.next = i;
            i = j;
            j = k;
        }
        return i;
    }
    private ListNode merge(ListNode h1, ListNode h2){
        ListNode h = new ListNode(0), i = h;
        while (h1 != null || h2 != null){
            if (h1 != null){
                i.next = h1;
                i = h1;
                h1 = h1.next;
            }
            if (h2 != null){
                i.next = h2;
                i = h2; 
                h2 = h2.next;
            }
        }
        return h.next;
    }
}