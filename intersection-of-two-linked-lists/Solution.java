/**
	leetcode - Intersection Of Two Linked Lists
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.7
*/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        for (ListNode p = headA; p != null; p = p.next){
            lenA++;  
        } 
        for (ListNode q = headB; q != null; q = q.next){
            lenB++;
        }
        ListNode p = headA, q = headB;
        while (lenA != lenB){
            if (lenA > lenB){
                p = p.next;
                lenA--;
            }else{
                q = q.next;
                lenB--;
            }
        }
        while (p != q && p != null && q != null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}