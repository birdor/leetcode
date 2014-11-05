/**
	leetcode - Linked List Cycle
	Time: O(n)
	Space: O(1)
	Completed: 2014.11.03 
*/
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fastIter = head.next, slowIter = head;
        while (fastIter != slowIter && fastIter != null){
            fastIter = fastIter.next;
            if (fastIter != null)
                fastIter = fastIter.next;
            slowIter = slowIter.next;
        }
        return fastIter == slowIter && fastIter != null;
    }
}