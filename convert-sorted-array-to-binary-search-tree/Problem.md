## leetcode - Convert Sorted Array To Binary Search Tree
- Time: 2015.01.10
- Tags: tree

### Problem Description [link][1]
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

### Solution
```java
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return construct(num, 0, num.length - 1);
    }
    
    private TreeNode construct(int[] num, int l, int r){
        if (l > r){
            return null;
        }else{
            int mid = l + (r - l)/2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = construct(num, l, mid - 1);
            root.right = construct(num, mid + 1, r);
            return root;
        }
    }
}
```

[1]: https://oj.leetcode.com/problems/convert-sorted-array-to-binary-search-tree/ "convert-sorted-array-to-binary-search-tree"

