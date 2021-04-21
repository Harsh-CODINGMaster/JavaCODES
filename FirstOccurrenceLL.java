import java.util.Scanner;

public class FirstOccurrenceLL {
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

	public static int FirstOccur(Node<Integer> head, int element) {

		if (head == null) {
			return -1;
		}
		if (head.data == element)
			return 0;
		int i = FirstOccur(head.next, element);
		if (i >= 0) {
			++i;
			return i;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		int element = 30;
	int finalAns =	FirstOccur(head, element);
	System.out.println(finalAns);
	}

}
