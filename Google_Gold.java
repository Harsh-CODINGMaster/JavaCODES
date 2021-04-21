
public class Google_Gold {
	public static int DP(int arr[][]) {
		int dp[][] = new int[arr.length][arr[0].length];
		// columns
		for (int j = arr[0].length - 1; j >= 0; j--) {
			// rows
			for (int i = 0; i < arr.length; i++) {

				// last col
				if (j == arr[0].length - 1) {
					dp[i][j] = arr[i][j];
				}
				// first row
				else if (i == 0) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
				}
				// last row...
				else if (i == arr.length - 1) {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
				}
				// rest middle part...
				else {
					dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
				}

			}

		}
		// pritning 2d dp array...
//		for (int i = 0; i < dp.length; i++)
//			for (int j = 0; j < dp[0].length - 1; j++)
//				System.out.println(dp[i][j]);
		// returning max of first col of dp array
		int max = 0;
		for (int k = 0; k < dp.length; k++) {
			if (max < dp[k][0]) {
				max = dp[k][0];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[][] = { { 0, 1, 4, 2, 8, 2 }, { 4, 3, 6, 5, 0, 4 }, { 1, 2, 4, 1, 4, 6 }, { 2, 0, 7, 3, 2, 2 },
				{ 3, 1, 5, 9, 2, 4 }, { 2, 7, 0, 8, 5, 1 } };
		System.out.println("Max gold that can be obtained is" + DP(arr));
	}
}
