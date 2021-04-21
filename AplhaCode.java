
public class AplhaCode {
	public static int name(int arr[], int size) {

		if (size == 0 || size == 1) {
			return 1;
		}
		int output = name(arr, size - 1);

		if (arr[size - 2] * 10 + arr[size - 1] <= 26)
			output += name(arr, size - 2);

		return output;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 1, 4 };
		int ans = name(arr, arr.length);
		System.out.println(ans);
	}
}
