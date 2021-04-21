import java.util.Scanner;

public class ConstructTreeFromInAndPreOrder_Working {

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

	public static BinaryTreeNode<Integer> FinalPreAnd_InOrder(int[] pre, int[] in, int start_index_of_pre,
			int end_index_of_pre, int start_index_of_in, int end_index_of_in) {

		if (start_index_of_pre > end_index_of_pre || start_index_of_in > end_index_of_in) {
			return null;
		}
		int data = pre[start_index_of_pre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		int rootIndex = -1;

		for (int i = start_index_of_in; i <= end_index_of_in; i++) {
			if (data == in[i]) {
				rootIndex = i;
				break;
			}
		}

		if (rootIndex == -1) {
			return null;
		}
		// all for root.left
		int left_starting_of_in = start_index_of_in;
		int left_ending_of_in = rootIndex - 1;
		int left_starting_of_pre = start_index_of_pre + 1;
		int left_ending_of_pre = left_starting_of_pre + left_ending_of_in - left_starting_of_in;
		// all for root.right
		int right_starting_of_in = rootIndex + 1;
		int right_ending_of_in = end_index_of_in;
		int right_starting_of_pre = left_ending_of_pre + 1;
		int right_ending_of_pre = end_index_of_pre;

		root.left = FinalPreAnd_InOrder(pre, in, left_starting_of_pre, left_ending_of_pre, left_starting_of_in,
				left_ending_of_in);
		root.right = FinalPreAnd_InOrder(pre, in, right_starting_of_pre, right_ending_of_pre, right_starting_of_in,
				right_ending_of_in);

		return root;

	}

	public static BinaryTreeNode<Integer> Helper_PreAnd_InOrder(int[] pre, int[] in) {
		return FinalPreAnd_InOrder(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int pre[] = { 1, 2, 4, 8, 9, 10, 11, 5, 3, 6, 7 };
		int in[] = { 8, 4, 10, 9, 11, 2, 5, 1, 6, 3, 7 };
		BinaryTreeNode<Integer> root = Helper_PreAnd_InOrder(pre, in);
		print(root);
	}
}
