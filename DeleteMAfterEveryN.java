import java.util.Scanner;

public class DeleteMAfterEveryN {
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

	public static Node<Integer> DeleteMAfterEveryN_LL(Node<Integer> head, int M, int N) {
		Node<Integer> curr = head;
		
		Node<Integer> t;
		while (curr != null) {

			for (int count = 1; count < M && curr != null; count++) {
				curr = curr.next;
			}
			if (curr == null) {
				return head;
			}

			t = curr.next;
			for (int count = 1; count <= N && t != null; count++) {
				
				t = t.next;
			}
			curr.next = t;
			curr = t;
		}
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
		int M = 1, N = 3;
		Node<Integer> head1 = DeleteMAfterEveryN_LL(head, M, N);
		print(head1);
	}

}
