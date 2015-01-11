## leetcode - Intersection Of Two Linked Lists
- Time: 2015.01.07
- Tags: linked list

### Problem Description [link][1]
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:
```
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
```
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
Credits:
Special thanks to @stellari for adding this problem and creating all test cases.


### Solution
```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        for (ListNode p = headA; p != null; p = p.next){
            lenA++;  
        } 
        for (ListNode q = headB; q != null; q = q.next){
            lenB++;
        }
        ListNode p = headA, q = headB;
        while (lenA != lenB){
            if (lenA > lenB){
                p = p.next;
                lenA--;
            }else{
                q = q.next;
                lenB--;
            }
        }
        while (p != q && p != null && q != null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
```

[1]: https://oj.leetcode.com/problems/intersection-of-two-linked-lists/ "intersection-of-two-linked-lists"

