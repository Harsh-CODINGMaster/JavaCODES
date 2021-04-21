
public class Arithmetic_Slices1 {
	public static void DP(int arr[]) {
		int dp[] = new int[arr.length];
		dp[0] = 0;
		dp[1] = 0;
		int sum = 0;
		for (int i = 2; i < dp.length; i++) {
			if ((arr[i] - arr[i - 1]) == (arr[i - 1] - arr[i - 2])) {
				dp[i] = dp[i - 1] + 1;
				sum += dp[i];
			}
		}
		System.out
				.println("Total AP's that can be formed from this i/p considering" + "all of its subarrays are " + sum);
	}

	public static void main(String[] args) {
		int arr[] = {2,5,9,12,15,18,22,26,30,34,36};
		DP(arr);
	}
}
