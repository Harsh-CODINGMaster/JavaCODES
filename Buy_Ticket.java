import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Buy_Ticket {
	public static int ticket(int[] arr, int k) {

		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < arr.length; i++) {
			q.add(i);
			pq.add(arr[i]);
		}

		int timer = 0;
		while (!q.isEmpty()) {

			if (arr[q.peek()] < pq.peek()) {
				q.add(q.poll());

			} else {
				int temp = q.poll();

				
				pq.remove();
				timer++;
				if (temp == k) {
					return timer;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int k = 2;
		int arr[] = { 3, 9, 4 };
		int time = ticket(arr, k);
		System.out.println(time);
	}
}
