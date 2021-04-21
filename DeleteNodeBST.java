import java.util.Scanner;

import com.sun.source.tree.BinaryTree;

public class DeleteNodeBST {

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

	public static BinaryTreeNode<Integer> DeleteNodeBST(int x, BinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		else if (x > root.data) {
			root.right = DeleteNodeBST(x, root.right);
			return root;
		} else if (x < root.data) {
			root.left = DeleteNodeBST(x, root.left);
			return root;
		} else {
			if (root.left == null && root.right == null)
				return null;
			else if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
			else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null)

				{

					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = DeleteNodeBST(minNode.data, root.right);

			}
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		int x = 4;
		BinaryTreeNode<Integer> root1 = DeleteNodeBST(x, root);

		print(root1);
	}
}
