import java.util.Scanner;

public class test{
	public static void main(String[] args){
		Solution so = new Solution();
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		so.recoverTree(root);
		System.out.println(root.val + " " + root.left.val + " " + root.right.val + " ");
	}
}
