
public class All_Palindrome_Substrings {
	public static int Palindromic(String input) {

		int count = 0;

		boolean dp[][] = new boolean[input.length()][input.length()];

		for (int gap = 0; gap < input.length(); gap++) {
			for (int i = 0, j = gap; j < dp.length; i++, j++) {

				if (gap == 0) {
					dp[i][j] = true;
				} else if (gap == 1) {

					if (input.charAt(i) == input.charAt(j)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}

				}

				else {
					if (input.charAt(i) == input.charAt(j) && dp[i + 1][j - 1] == true) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					}
				}
				if (dp[i][j]) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		String input = "abccbc";
		int ans = Palindromic(input);
		System.out.println(ans);

	}
}
