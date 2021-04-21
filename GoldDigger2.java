
public class GoldDigger2 {
	public static int Path_With_Max_Gold(int arr[][]) {
		int dp[][] = new int[arr.length][arr[0].length];
// i represents column and j represents row ...
		for (int i = arr[0].length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				// last column
				if (i == arr[0].length - 1) {
					dp[j][i] = arr[j][i];

				}
				// first row
				else if (j == 0) {
					dp[j][i] = arr[j][i] + Math.max(dp[j][i + 1], dp[j + 1][i + 1]);

				}
				// last row
				else if (j == arr.length - 1) {
					dp[j][i] = arr[j][i] + Math.max(dp[j - 1][i + 1], dp[j][i + 1]);

				}
				// middle part
				else {
					dp[j][i] = arr[j][i] + Math.max(dp[j + 1][i + 1], Math.max(dp[j][i + 1], arr[j - 1][i + 1]));

				}
			}
		}

		int max = dp[0][0];
		for (int i = 0; i < dp.length; i++) {
			// System.out.println(dp[i][0]);
			if (dp[i][0] > max) {
				max = dp[i][0];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[][] = { { 0, 1, 4, 2, 8, 2 }, { 4, 3, 6, 5, 0, 4 }, { 1, 2, 4, 1, 4, 6 }, { 2, 0, 7, 3, 2, 2 },
				{ 3, 1, 5, 9, 2, 4 }, { 2, 7, 0, 8, 5, 1 } };
		int ans = Path_With_Max_Gold(arr);
		System.out.println(ans);
	}
}
