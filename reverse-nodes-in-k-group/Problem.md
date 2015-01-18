## leetcode - Reverse Nodes In K Group
- Time: 2015.01.16
- Tags: linked list

### Problem Description [link][1]
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.

You may not alter the values in the nodes, only nodes itself may be changed.

Only constant memory is allowed.

For example,
Given this linked list: `1->2->3->4->5`

For k = 2, you should return: `2->1->4->3->5`

For k = 3, you should return: `3->2->1->4->5`


### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/reverse-nodes-in-k-group/ "reverse-nodes-in-k-group"

