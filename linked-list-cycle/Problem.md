## leetcode - Linked List Cycle
- Time: 2014.11.03
- Tags: 

### Problem Description [link][1]
Given a linked list, determine if it has a cycle in it.

Follow up:

Can you solve it without using extra space?


### Solution
```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        for (ListNode inode = head; inode != null; inode = inode.next){
            if (set.contains(inode))
                return true;
            set.add(inode);
        }
        return false;
    }
}
```
The elegant way with O(1) space is:
```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;
        ListNode fastIter = head.next, slowIter = head;
        while (fastIter != slowIter && fastIter != null){
            fastIter = fastIter.next;
            if (fastIter != null)
                fastIter = fastIter.next;
            slowIter = slowIter.next;
        }
        return fastIter == slowIter && fastIter != null;
    }
}
```

[1]: https://oj.leetcode.com/problems/linked-list-cycle/ "linked-list-cycle"

