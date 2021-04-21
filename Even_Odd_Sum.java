
public class Even_Odd_Sum {
	public static void call(int n) {

		
		int odd_Sum = 0;
		int Even_Sum = 0;
		while (n > 0) {
			int b = n % 10;
			if (b % 2 == 0) {
				Even_Sum += b;
			} else {
				odd_Sum += b;
			}
			n = n / 10;
		}
		System.out.println("Sum of even digits is " + Even_Sum);
		System.out.println("Sum of odd digits is " + odd_Sum);
	}

	public static void main(String[] args) {
		int a = 821794563;
		call(a);
	}
}
