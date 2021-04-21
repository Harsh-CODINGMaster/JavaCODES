import java.util.Scanner;

public class CheckElement {

	public static TreeNode<Integer> takeInput() {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the no of children for node " + n);
		int ChildCount = s.nextInt();

		for (int i = 0; i < ChildCount; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}

	public static Boolean CheckElement(TreeNode<Integer> root, int x) {
		if (root == null)
			return false;
		Boolean ans = false;// initialization  
		if (root.data == x)
			return true;
		for (TreeNode<Integer> child : root.children) {
			ans = CheckElement(child, x);
			if (ans == true) {
				return true;
			} // end of if
		} // end of for loop
		return ans; // returning if ans is false
	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++)
			s = s + root.children.get(i).data + ",";
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++)
			print(root.children.get(i));
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInput();
		print(root);
		int x = 2;
		Boolean finalAns = CheckElement(root, x);
		System.out.println(finalAns);
	}
}
