
public class Climing_Stairs_Min_Moves {

	public static void moves_DP(int arr[]) {
		Integer dp[] = new Integer[arr.length + 1];
		dp[arr.length] = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > 0) {
				int min = Integer.MAX_VALUE;
				for (int j = 1; j <= arr[i] && (i + j) < dp.length; j++) {
					// the value should not be null ...
					if (dp[i + j] != null)
						min = Math.min(min, dp[i + j]);
				}
				// i.e. min updated there is a route possible ...
				if (min != Integer.MAX_VALUE) {
					dp[i] = min + 1;
				}
				// this has already been taken care of since Integer array ...
				else {
					dp[i] = null;
				}
			}
		}
		System.out.println("Value at 0th subscript of dp array is ..." + dp[0]);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 2, 4, 2, 0, 2, 3, 1, 2, 2 };
		moves_DP(arr);
	}
}
