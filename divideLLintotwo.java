
public class divideLLintotwo {

	public static void make2List(ListNode<Integer> head) {

		int c = 0;
		ListNode<Integer> h1 = null;
		ListNode<Integer> h2 = null;

		while (head != null) {
			if (c % 2 == 0) {
				if (h1 == null) {
					ListNode<Integer> newNode1 = new ListNode<>(head.data);
					h1 = newNode1;

				} else {
					ListNode<Integer> newNode1 = new ListNode<>(head.data);

					newNode1.next = h1;
					h1 = newNode1;
				}
			} else {
				if (h2 == null) {
					ListNode<Integer> newNode2 = new ListNode<>(head.data);
					h2 = newNode2;

				} else {
					ListNode<Integer> newNode2 = new ListNode<>(head.data);

					newNode2.next = h2;
					h2 = newNode2;
				}
			}
			c++;
			head = head.next;

		}

		while (h1 != null) {
			System.out.print(h1.data + " ");
			h1 = h1.next;
		}
		System.out.println();
		while (h2 != null) {
			System.out.print(h2.data + " ");
			h2 = h2.next;
		}

	}
}