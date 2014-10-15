/**
	leetcode - Add Two Numbers
	Time: O(n)
	Space: O(n)
	Completed: 2014.10.14
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	for (ListNode k = head; k != null; k = k.next){
    		if (l1 != null){
    			k.val += l1.val;
    			l1 = l1.next;
    		}
    		if (l2 != null){
    			k.val += l2.val;
    			l2 = l2.next;
    		}
    		if (k.val > 9 || l1 != null || l2 != null){
    			k.next = new ListNode(k.val / 10);
    			k.val %= 10;
    		}
    	}
    	return head;
    }
}