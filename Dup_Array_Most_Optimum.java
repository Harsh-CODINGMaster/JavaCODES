
public class Dup_Array_Most_Optimum {
	public static void name(int a[]) {

		// this algo takes

		/**
		 * O(n) time O(1) space finds duplicate values as well ...
		 */
		System.out.println("Repeating values are :");
		for (int i = 0; i < a.length; i++) {
			a[a[i] % a.length] += a.length;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= a.length * 2) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		name(arr);
	}
}
