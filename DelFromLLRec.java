import java.util.Scanner;

public class DelFromLLRec {

	public static Node<Integer> takeInput() {

		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while (data != -1) {

			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null)
				head = newNode;

			else {
				Node<Integer> temp = head;
				while (temp.next != null)
					temp = temp.next;
				temp.next = newNode;
			}

			data = s.nextInt();
		}
		return head;

	}

	public static Node<Integer> DelNthNodeRec(Node<Integer> head, int n) {
		if (head == null) {
			return head;
		}

		if (n == 0) {
			return head.next;
		}

		head.next = DelNthNodeRec(head.next, n - 1);
		return head;
	}

	public static void print(Node<Integer> head) {

		while (head != null) {

			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		System.out.println("Enter index to be deleted");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		Node<Integer> head1 = DelNthNodeRec(head, n);
		print(head1);
	}

}
