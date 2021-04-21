import java.util.Scanner;

public class InsertNodeBST {

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

	public static BinaryTreeNode<Integer> Insertion(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			BinaryTreeNode<Integer> Final_root = new BinaryTreeNode<Integer>(x);
			return Final_root;

		}
		if (x >= root.data) { // assuming duplicacy in right part
			root.right = Insertion(root.right, x);

		}
		if (x < root.data) {

			root.left = Insertion(root.left, x);
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		int x = 2;
		BinaryTreeNode<Integer> Final_root = Insertion(root, x);
		print(Final_root);
	}
}
