## leetcode - Copy List With Random Pointer
- Time: 2014.11.03
- Tags: linked list, hashmap

### Problem Description [link][1]
A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

### Solution
```java
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null)
            return null;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode hook = new RandomListNode(0);
        for (RandomListNode i = head, j = hook; i != null; i = i.next){
            j.next = new RandomListNode(i.label);
            j = j.next;
            map.put(i, j);
        }
        for (RandomListNode i = head, j; i != null; i = i.next){
            j = map.get(i);
            j.random = map.get(i.random);
        }
        return hook.next;
    }
}
```

[1]: https://oj.leetcode.com/problems/copy-list-with-random-pointer/ "copy-list-with-random-pointer"

