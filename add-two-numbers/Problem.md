## leetcode - Add Two Numbers
- Time: 2014.10.14
- Tags: simulation

### Problem Description [link][1]
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/add-two-numbers/ "add-two-numbers"

