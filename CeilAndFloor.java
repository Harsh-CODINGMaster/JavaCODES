import java.util.Scanner;

public class CeilAndFloor {

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

	public static int ceil = Integer.MAX_VALUE;
	public static int floor = Integer.MIN_VALUE;

	public static void Ceil_Floor(int data, TreeNode<Integer> root) {

		if (root.data > data) {
			if (root.data < ceil) {
				ceil = root.data;
			}
		}
		if (root.data < data) {
			if (root.data > floor) {
				floor = root.data;

			}
		}
		for (TreeNode<Integer> child : root.children)
			Ceil_Floor(data, child);

	}

	public static int kth_Largest(int k, TreeNode<Integer> root) {

		int factor = Integer.MAX_VALUE;
		// int Finalans =0 ;
		for (int i = 0; i < k; i++) {
			Ceil_Floor(factor, root);
			//System.out.println(floor);
			factor = floor;
			floor = Integer.MIN_VALUE;

		}
		return factor;
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
		//int data =  25;
//		Ceil_Floor(data, root);
//		System.out.println("ceil value is "+ ceil);
//		System.out.println("floor value is "+ floor);
//		print(root1);

//		int data =25;
//		int floorFinalValue = Ceil_Floor(data, root1);
//		System.out.println(floorFinalValue);
		int k = 2;
		int Finalans = kth_Largest(k, root);
		System.out.println(Finalans);
	}
}
