import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Solution0 so = new Solution0();
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		// root.right = new TreeNode(1);
		so.recoverTree(root);
		System.out.println(root.val + " " + root.left.val + " " + root.right.val + " ");
	}
}
