import java.util.Scanner;

public class CreateAndInsertDuplicateBST {

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

	public static BinaryTreeNode<Integer> Insert_Duplicacy(BinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		root.left = Insert_Duplicacy(root.left);
		root.right = Insert_Duplicacy(root.right);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = new BinaryTreeNode<Integer>(root.data);
		root.left.left = temp;

		return root;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		int x = 4;
		BinaryTreeNode<Integer> root1 = Insert_Duplicacy(root);
		print(root1);
	}
}
