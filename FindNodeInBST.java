import java.util.Scanner;

public class FindNodeInBST {

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

	public static Boolean Node_Finder_BST(BinaryTreeNode<Integer> root, int x) {

		if (root == null)
			return false;
		if (root.data == x)
			return true;
		if (root.data < x)
			return Node_Finder_BST(root.right, x);
		else if (root.data > x)
			return Node_Finder_BST(root.left, x);
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		int x = 2;
		Boolean FinalAns = Node_Finder_BST(root, x);
		System.out.println(FinalAns);
	}
}
