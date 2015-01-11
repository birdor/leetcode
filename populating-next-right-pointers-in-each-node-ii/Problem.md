## leetcode - Populating Next Right Pointers In Each Node Ii
- Time: 2015.01.11
- Tags: tree, linked list

### Problem Description [link][1]
ollow up for problem "Populating Next Right Pointers in Each Node".

What if the given tree could be any binary tree? Would your previous solution still work?

Note:

You may only use constant extra space.
For example,
Given the following binary tree,
```
         1
       /  \
      2    3
     / \    \
    4   5    7
```
After calling your function, the tree should look like:
```
         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \    \
    4-> 5 -> 7 -> NULL
```

### Solution
```java
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

[1]: https://oj.leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/ "populating-next-right-pointers-in-each-node-ii"

