## leetcode - Insertion Sort List
- Time: 2014.10.03
- Tags: linked list

### Problem Description [link][1]
Sort a linked list using insertion sort.


### Solution

```java
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode hook = new ListNode(0);
        for (ListNode i = head, k; i != null; i = k){
        	ListNode j = hook;
        	while (j.next != null && j.next.val < i.val) 
        		j = j.next;
        	k = i.next;
        	i.next = j.next;
        	j.next = i;
        }
        return hook.next;
    }
}

```

[1]: https://oj.leetcode.com/problems/insertion-sort-list/ "insertion-sort-list"

