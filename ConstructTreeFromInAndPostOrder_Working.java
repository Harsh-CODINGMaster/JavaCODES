import java.util.Scanner;

public class ConstructTreeFromInAndPostOrder_Working {

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

//InE - inorder ke array ka end
//InS - inorder ke array ka start
//PostE - postorder ke array ka end
//PostS - postorder ke array ka start
	public static BinaryTreeNode<Integer> FinalInAnd_PostOrder(int[] post, int[] in, int PostS, int PostE, int InS,
			int InE) {

		if (InS > InE)
			return null;

		int rootData = post[PostE];

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;

		for (int i = InS; i <= InE; i++) {

			if (rootData == in[i]) {
				rootIndex = i;
				break;
			}

		}
// all for left
		int left_In_E = rootIndex - 1;
		int left_In_S = InS;
		int left_Post_S = PostS;
		int left_Post_E = left_Post_S + left_In_E - left_In_S;

		// all for right
		int right_In_E = InE;
		int right_In_S = rootIndex + 1;
		int right_Post_S = left_Post_E + 1;
		int right_Post_E = PostE - 1;

		root.left = FinalInAnd_PostOrder(post, in, left_Post_S, left_Post_E, left_In_S, left_In_E);
		root.right = FinalInAnd_PostOrder(post, in, right_Post_S, right_Post_E, right_In_S, right_In_E);

		return root;
	}

	public static BinaryTreeNode<Integer> Helper_InAnd_PostOrder(int[] post, int[] in) {
		return FinalInAnd_PostOrder(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int post[] = { 9, 1, 2, 12, 7, 5, 3, 11, 4, 8 };
		int in[] = { 9, 5, 1, 7, 2, 12, 8, 4, 3, 11 };
		BinaryTreeNode<Integer> root = Helper_InAnd_PostOrder(post, in);
		print(root);
	}
}
