/**
	leetcode - Binary Search Tree Iterator
	Time: O(h)
	Space: O(h)
	Completed: 2015.1.4
*/
import java.util.*;

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

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */