/**
	leetcode - Rotate List
	Time: O(n)
	Space: O(1)
	Completed: 2014.10.21
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
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null)
            return head;
        int len = 0;
        ListNode hook = head, tail = head;
        for (ListNode i = head; i != null; i = i.next) len++;
        n %= len;
        if (n == 0)
            return head;
        for (ListNode i = head; i != null; i = i.next){
            len--;
            if (len == n){
                head = i.next;
                tail = i;
            }
            if (i.next == null){
                i.next = hook;
                break;
            }
        }
        tail.next = null;
        return head;
    }
}