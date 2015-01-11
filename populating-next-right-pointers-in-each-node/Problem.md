## leetcode - Populating Next Right Pointers In Each Node
- Time: 2015.01.11
- Tags: tree, linked list

### Problem Description [link][1]
Given a binary tree
```c
    struct TreeLinkNode {
      	TreeLinkNode *left;
      	TreeLinkNode *right;
      	TreeLinkNode *next;
    }
```
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
For example,
Given the following perfect binary tree,
```
         1
       /  \
      2    3
     / \  / \
    4  5  6  7
```
After calling your function, the tree should look like:
```
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
```
### Solution
```java
/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        for (TreeLinkNode uphead = root, downhead = null; uphead != null; uphead = downhead, downhead = null){
            for (TreeLinkNode p = uphead, q = null; p != null; p = p.next){
                if (downhead == null){
                    if (p.left != null){
                        q = downhead = p.left;
                    }else if (p.right != null){
                        q = downhead = p.right;
                    }
                }
                if (downhead != null){
                    if (p.left != null && p.left != q){
                        q.next = p.left;
                        q = q.next;
                    }
                    if (p.right != null && p.right != q){
                        q.next = p.right;
                        q = q.next;
                    }
                }
            }
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node/ "populating-next-right-pointers-in-each-node"

