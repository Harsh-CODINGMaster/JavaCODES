import java.util.HashMap;

public class Boxes_Of_Toys {

	public static int MAximum_Distribution(int arr[], int k) {

		int maxSum = 0;
		int sum[] = new int[arr.length];
		sum[0] = arr[0];
		for (int i = 1; i < sum.length; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}
		int Curr_Remainder = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < sum.length; i++) {

			Curr_Remainder = sum[i] % k;

			if (Curr_Remainder == 0) {
				if (maxSum < sum[i]) {
					maxSum = sum[i]; 
				}
			}

			else if (!map.containsKey(Curr_Remainder)) {
				map.put(Curr_Remainder, i);
			}

			else if (maxSum < (sum[i] - sum[map.get(Curr_Remainder)])) {
				maxSum = sum[i] - sum[map.get(Curr_Remainder)];
			}
		}
		return maxSum / k;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 7, 6, 1, 4, 5 };
		int ans = MAximum_Distribution(arr, 3);
		System.out.println(ans);
	}
}
