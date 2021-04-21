import java.util.HashMap;

public class Arithmetic_Slides_2 {
	public static int DP(int arr[]) {
		int ans = 0;
		HashMap<Integer, Integer>[] maps = new HashMap[arr.length];
		for (int k = 0; k < arr.length; k++) {
			maps[k] = new HashMap<>();
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				long common_difference = (long) arr[i] - (long) arr[j];

				if (common_difference < Integer.MIN_VALUE || common_difference >= Integer.MAX_VALUE) {
					continue;
				}

				int APs_ending_on_j = maps[j].getOrDefault((int) common_difference, 0);
				int APs_ending_on_i = maps[i].getOrDefault((int) common_difference, 0);

				ans += APs_ending_on_j;
				maps[i].put((int) common_difference, APs_ending_on_i + APs_ending_on_j + 1);

			}

		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 2, 3, 5, 2, 6, 7 };
		System.out.print("APs >=3 of all subsets are : ");
		System.out.println(DP(arr));
	}
}
