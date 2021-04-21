import java.util.ArrayList;

public class KADANES {
	public static int Kadanes(int arr[]) {
		int current_sum = arr[0];
		int overall_sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (current_sum >= 0) {
				current_sum += arr[i];
			} else {
				current_sum = arr[i];
			}

			if (current_sum > overall_sum) {
				overall_sum = current_sum;
			}
		}

		return overall_sum;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, -2, 6, -14, 7, -1, 4 };
		int finalans = Kadanes(arr);
		System.out.println("Max sum of a asubarray of array is " + finalans);
	}
}
