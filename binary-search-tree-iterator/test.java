import java.util.*;

public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);

		BSTIterator it = new BSTIterator(root);
		while (it.hasNext()){
			System.out.println(it.next());
		}

	}
}
