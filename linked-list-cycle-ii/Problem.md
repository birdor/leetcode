## leetcode - Linked List Cycle Ii
- Time: 2015.01.07
- Tags: linked list

### Problem Description [link][1]
Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Follow up:
Can you solve it without using extra space?


### Solution
```java
public class Solution {
    public ListNode detectCycle(ListNode head) {
        for (ListNode i1 = head, i2 = head; i2 != null && i2.next != null;){
            i1 = i1.next;
            i2 = i2.next.next;
            if (i1 == i2){
                for (i2 = head; i1 != i2; i1 = i1.next, i2 = i2.next);
                return i1;
            }
        }
        return null;
    }
}
```

[1]: https://oj.leetcode.com/problems/linked-list-cycle-ii/ "linked-list-cycle-ii"

