/**
	leetcode - Populating Next Right Pointers In Each Node Ii
	Time: O(n)
	Space: O(1)
	Completed: 2015.1.11
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