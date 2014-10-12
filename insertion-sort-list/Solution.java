/**
	leetcode - Insertion Sort List
	Time: O(n^2)
	Space: O(n)
	Completed: 2014.10.11
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
    public ListNode insertionSortList(ListNode head) {
        ListNode hook = new ListNode(0);
        for (ListNode i = head, k; i != null; i = k){
        	ListNode j = hook;
        	while (j.next != null && j.next.val < i.val) 
        		j = j.next;
        	k = i.next;
        	i.next = j.next;
        	j.next = i;
        }
        return hook.next;
    }
}