import java.util.*;

public class test{
	public static void main(String[] args){
		Solution so = new Solution();
		assert so.maxPathSum(arrayToTree(new int[] {-1})) == -1;
		assert so.maxPathSum(arrayToTree(new int[] {-1, -1, -2})) == -2;
		assert so.maxPathSum(arrayToTree(new int[] {1, -10, 10, 100, 1, 20, 15})) == 91;
		assert so.maxPathSum(arrayToTree(new int[] {1, -1})) == 1;
		System.out.println("successful!");
	}

	private static TreeNode arrayToTree(int[] vals){
		TreeNode root = null;
		if (vals.length > 0){
			root = new TreeNode(vals[0]);
			LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
			queue.add(root);
			int i = 1;
			while (queue.size() > 0 && i < vals.length){
				TreeNode node = queue.poll();
				node.left = new TreeNode(vals[i++]);
				queue.add(node.left);
				if (i < vals.length){
					node.right = new TreeNode(vals[i++]);
					queue.add(node.right);
				}
			}
		}
		return root;
	}
}
