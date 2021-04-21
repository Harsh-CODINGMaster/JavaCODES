import java.util.Scanner;

public class BalancedBinaryTree {

	public static BinaryTreeNode<Integer> takeInput(Scanner s) {

		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if (rootData == -1)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
	}

	public static void print(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		String toBePrinted = root.data + " ";
		if (root.left != null)
			toBePrinted += "L:" + root.left.data + ",";
		if (root.right != null)
			toBePrinted += "R:" + root.right.data;
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);

	}

	public static Boolean Check_Balanced_Binary_Tree(BinaryTreeNode<Integer> root) {

		Boolean ans = false;

		if (root == null) {
			return true;
		}
		int left_subtree_height = Height_Finder(root.left);
		int right_subtree_height = Height_Finder(root.right);
		if (Math.abs(left_subtree_height - right_subtree_height) <= 1 && Check_Balanced_Binary_Tree(root.left)
				&& Check_Balanced_Binary_Tree(root.right))

			ans = true;
		return ans;
	}

	public static int Height_Finder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		int height = 0;

		return 1 + Math.max(Height_Finder(root.left), Height_Finder(root.right));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);

		Boolean ans = Check_Balanced_Binary_Tree(root);
		System.out.println(ans);
	}
}
