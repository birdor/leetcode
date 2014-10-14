import java.util.Scanner;

public class test{
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		Solution so = new Solution();
		System.out.println(so.sumNumbers(root));
	}
}
