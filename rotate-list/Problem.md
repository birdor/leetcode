## leetcode - Rotate List
- Time: 2014.10.21
- Tags: linked list, hard

### Problem Description [link][1]
Given a list, rotate the list to the right by k places, where k is non-negative.

For example:
Given `1->2->3->4->5->NULL` and `k = 2`,
return `4->5->1->2->3->NULL`
.

### Solution
```java
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
```

[1]: https://oj.leetcode.com/problems/rotate-list/ "rotate-list"

