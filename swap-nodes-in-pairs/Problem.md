## leetcode - Swap Nodes In Pairs
- Time: 2014.10.19
- Tags: linked list

### Problem Description [link][1]
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given `1->2->3->4`, you should return the list as `2->1->4->3`.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

### Solution
```java
public class Solution{
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode i = head, j = head.next, k = head.next.next;
        j.next = i;
        i.next = swapPairs(k);
        return j;
    }
}
```

[1]: https://oj.leetcode.com/problems/swap-nodes-in-pairs/ "swap-nodes-in-pairs"

