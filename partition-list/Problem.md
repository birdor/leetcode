## leetcode - Partition List
- Time: 2014.11.14
- Tags: tree

### Problem Description [link][1]
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given `1->4->3->2->5->2` and `x = 3`,
return `1->2->2->4->3->5`.

### Solution
```java
public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode hook1 = new ListNode(0), tail1 = hook1;
        ListNode hook2 = new ListNode(0), tail2 = hook2;
        for (ListNode i = head; i != null; i = i.next){
            if (i.val < x){
                tail1.next = i;
                tail1 = i;
            }else{
                tail2.next = i;
                tail2 = i;
            }
        }
        tail1.next = hook2.next;
        tail2.next = null;
        return hook1.next;
    }
}
```

[1]: https://oj.leetcode.com/problems/partition-list/ "partition-list"

