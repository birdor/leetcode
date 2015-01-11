## leetcode - Binary Search Tree Iterator
- Time: 2015.01.04
- Tags: tree

### Problem Description [link][1]
Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.

Credits:
Special thanks to @ts for adding this problem and creating all test cases.

### Solution
```java
public class BSTIterator {

    class Context{
        TreeNode node = null;
        int status = 0;
        public Context(TreeNode x){node = x;}
    }
    
    LinkedList<Context> stack = new LinkedList<Context>();
    
    public BSTIterator(TreeNode root) {
        stack.push(new Context(root));
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        while (!stack.isEmpty()){
            Context x = stack.getFirst();
            if (x.node == null || x.status == 3){
                stack.pop();
            }else if (x.status == 0){
                stack.push(new Context(x.node.left));
                x.status++;
            }else if (x.status == 1){
                return true;
            }else if (x.status == 2){
                stack.push(new Context(x.node.right));
                x.status++;
            }
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        if (this.hasNext()){
            stack.getFirst().status++;
            return stack.getFirst().node.val;
        }
        return 0;
    }
}
```

[1]: https://oj.leetcode.com/problems/binary-search-tree-iterator/ "binary-search-tree-iterator"

