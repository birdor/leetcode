## leetcode - Remove Duplicates From Sorted List Ii
- Time: 2014.10.20
- Tags: linked list

### Problem Description [link][1]
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

For example,
Given `1->2->3->3->4->4->5`, return `1->2->5`.
Given `1->1->1->2->3`, return `2->3`.

### Solution
```java
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode hook = new ListNode(0);
        hook.next = head;
        for (ListNode i = hook; i != null; i = i.next){
            while (i.next != null && i.next.next != null && i.next.val == i.next.next.val){
                int value = i.next.val;
                while (i.next != null && i.next.val == value)
                    i.next = i.next.next;
            }
        }
        return hook.next;
    }
}
```

[1]: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list-ii/ "remove-duplicates-from-sorted-list-ii"

