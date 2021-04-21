import java.util.Collections;
import java.util.Scanner;

public class LCA_Binary {

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

	public static int LCA_Binary_Tree(BinaryTreeNode<Integer> root, int a, int b) {

		if (root == null)
			return -1;
		if (root.data == a || root.data == b) {
			return root.data;

		}

		int c = LCA_Binary_Tree(root.left, a, b);
		int d = LCA_Binary_Tree(root.right, a, b);

		if (c == -1 && d != -1)
			return d;
		else if (d == -1 && c != -1)
			return c;

		else if (c == -1 && d == -1)
			return -1;
		else
			return root.data;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		int x = 4;
		int a = 2;
		int b = 3;
		int FinalAns = LCA_Binary_Tree(root, a, b);
		System.out.println(FinalAns);
	}
}
