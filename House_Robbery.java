
public class House_Robbery {
	public static int Approach1_Non_DP(int arr[]) {

		int count = arr.length;
		int first1 = 0;
		int second1 = 0;
		int first2 = 0;
		int second2 = 0;
		if (count % 2 == 0) {

			for (int i = 0; i <= arr.length - 2; i += 2) {
				first1 += arr[i];
			}

			for (int i = 1; i <= arr.length - 1; i += 2) {
				second1 += arr[i];
			}

		} else {

			for (int i = 0; i <= arr.length - 1; i += 2) {
				first2 += arr[i];
			}

			for (int i = 1; i <= arr.length - 2; i += 2) {
				second2 += arr[i];
			}

		}
		if (count % 2 == 0) {
			return Math.max(first1, second1);
		} else if (count % 2 != 0) {
			return Math.max(first2, second2);
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,1 };
		System.out.println(Approach1_Non_DP(arr));
	}
}
