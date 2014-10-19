## leetcode - Remove Duplicates From Sorted List
- Time: 2014.10.19
- Tags: 

### Problem Description [link][1]
Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given `1->1->2`, return `1->2`.
Given `1->1->2->3->3`, return `1->2->3`.

### Solution
```java
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        for (ListNode i = head; i != null; i = i.next){
            while (i.next != null && i.next.val == i.val)
                i.next = i.next.next;
        }
        return head;
    }
}
```

[1]: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/ "remove-duplicates-from-sorted-list"

