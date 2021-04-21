public class base_power {
	static int calculate(int n, int power) {
		int sum = 0;
		int bp = (int) Math.pow(n, power);
		while (bp != 0) {
			int d = bp % 10;
			sum += d;
			bp /= 10;
		}
		return sum;
	}

	static int sumDigits(int no) {
		return no == 0 ? 0 : no % 10 + sumDigits(no / 10);
	}

	// Driver Code
	public static void main(String[] args) {
		int n = 5;
		int power = 4;
		int throw11 = (int) Math.pow(n, power);
		int ans = throw11;
		while (ans >= 9) {
			ans = sumDigits(ans);
		}
		System.out.println(ans);
	}
}