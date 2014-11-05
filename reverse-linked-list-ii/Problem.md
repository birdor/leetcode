## leetcode - Reverse Linked List Ii
- Time: 2014.11.03
- Tags: linked list

### Problem Description [link][1]
Reverse a linked list from position m to n. Do it in-place and in one-pass.

For example:
Given `1->2->3->4->5->NULL`, m = 2 and n = 4,

return `1->4->3->2->5->NULL`.

Note:
Given m, n satisfy the following condition:

1 ≤ m ≤ n ≤ length of list.

### Solution
```java
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode hook = new ListNode(0);
        hook.next = head;
        ListNode bp = null;
        int id = 0;
        for (ListNode i = hook, j = i.next; j != null; ){
            id++;
            if (id == m)
                bp = i;
            if (id == n){
                bp.next.next = j.next;
                bp.next = j;
            }
            if (id > m && id <= n){
                ListNode tmp = j.next;
                j.next = i;
                i = j;
                j = tmp;
            }else{
                i = j;
                j = i.next;
            }
        }
        return hook.next;
    }
}
```

[1]: https://oj.leetcode.com/problems/reverse-linked-list-ii/ "reverse-linked-list-ii"

