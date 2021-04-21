import java.util.Scanner;

public class HeightOfABinaryTree {

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

	public static int Height_Finder(BinaryTreeNode<Integer> root) {
		int maxHeight = 0;
		if (root == null)
			return 0;

//	int height  = Height_Finder(root.left);
//	int height2 = Height_Finder(root.right);
//	
		 maxHeight = Math.max(Height_Finder(root.left), Height_Finder(root.right));

		return maxHeight + 1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(s);
		print(root);
System.out.println("Height is "+ Height_Finder(root));
	}
}
