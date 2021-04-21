public class flags {

	/*
	 * Your class should be named Solution Don't write main(). Don't read input, it
	 * is passed as function argument. Return output and don't print it. Taking
	 * input and printing output is handled automatically.
	 */
	// long ans=0;
	public static void helper(char prev, char prevprev, int N, int ans) {

		if (N == 1) {
			ans++;
			System.out.println("hi1");
			return;
			
		}
		if (prevprev == 'S' && N == 1) {
			ans = 2;
			System.out.println("hi1");
			return;
		}

		if (prevprev == 'S') {
			helper('B', 'W', N - 1, ans);
			helper('B', 'R', N - 1, ans);
		} else if (prev == 'B' && prevprev == 'R') {
			helper('W', 'B', N - 1, ans);

		} else if (prev == 'B' && prevprev == 'W') {
			helper('R', 'B', N - 1, ans);
		} else if (prev == 'R') {
			helper('W', 'R', N - 1, ans);
			helper('B', 'R', N - 1, ans);
		} else if (prev == 'W') {
			helper('R', 'W', N - 1, ans);
			helper('B', 'W', N - 1, ans);
		}
		// return ans;
	}

	public static int find_Ways(int N) {
		Integer ans = 0;
		helper('B','S', N, ans);
		return ans.intValue();
	}

	public static void main(String[] args) {
		int sna = find_Ways(3);
		System.out.println(sna);
	}
}
