import java.util.Scanner;

public class IdenticalTree {

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
	
		public static Boolean IdenticalTrees(TreeNode<Integer> root1 , TreeNode<Integer> root2) {
			Boolean ans = true;
			if(root1.children.size()!=root2.children.size())
				return false;
			if(root1.data!=root2.data)
				return false;
			for (int i = 0; i < root1.children.size(); i++) {
			ans =IdenticalTrees(root1.children.get(i), root2.children.get(i));	
			if(ans==false)
			{
				return false;
			}
			}
			return ans;	
		
		
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
		TreeNode<Integer> root1 = takeInput();
		print(root1);
		TreeNode<Integer> root2 = takeInput();
		print(root2);
		Boolean finalAns = IdenticalTrees(root1, root2);
		System.out.println(finalAns);
	}
}
