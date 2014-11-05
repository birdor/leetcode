## leetcode - Remove Nth Node From End Of List
- Time: 2014.11.03
- Tags: linked list

### Problem Description [link][1]
Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: `1->2->3->4->5`, and `n = 2`.

   After removing the second node from the end, the linked list becomes `1->2->3->5`.
Note:
Given n will always be valid. 
Try to do this in one pass.

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/ "remove-nth-node-from-end-of-list"

