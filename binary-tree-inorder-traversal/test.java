import java.util.Scanner;

public class test{
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(2);
		Solution so = new Solution();
		System.out.println(so.inorderTraversal(root));
	}
}
