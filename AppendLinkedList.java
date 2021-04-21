import java.util.Scanner;

public class AppendLinkedList {

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

//	public static Node<Integer> Append(Node<Integer> head, int pos) {
//
//		Node<Integer> head2 = head;
//		int i = 0;
//		while (i < pos - 1) {
//			head2 = head2.next;
//			i++;
//		}
//		int j = 0;
//		Node<Integer> temp = head;
//		while (j < pos - 2) {
//			temp = temp.next;
//		}
//		temp.next = null;
//		Node<Integer> temp1 = head2;
//		while (temp1.next != null) {
//			temp1 = temp1.next;
//		}
//		temp1.next = head;
//		return head2;
//	}
	public static int CountNoOfNodes(Node<Integer> head) {
		int c = 0;
		while (head != null) {
			c++;
			head = head.next;

		}
		return c;
	}

	public static Node<Integer> Append(Node<Integer> head, int count, int pos) {

		Node<Integer> head2 = head;
		int i = 0;
		while (i < count - pos) {
			head2 = head2.next;
			i++;
		}
		Node<Integer> temp = head;
		int j = 0;
		if (temp.next==head2) {
			temp.next = null;
		}
		else
		{
		while (temp.next != head2) {
			temp=temp.next;
		}
		temp.next=null;
		}
		Node<Integer> temp1 = head2;
		while (temp1.next != null) {
			temp1 = temp1.next;
		}
		temp1.next = head;
		return head2;
	}

	public static void print(Node<Integer> head) {

		while (head != null) {

			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		int count = CountNoOfNodes(head);
		System.out.println("Enter the position");
		int pos = s.nextInt();
		if(pos==0|| pos>=count) {
			System.out.println("invalid input");
		}
		else {
		Node<Integer> head2 = Append(head, count, pos);
		print(head2);
		}
		
	}

}
