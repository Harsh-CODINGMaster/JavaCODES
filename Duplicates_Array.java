
public class Duplicates_Array {
	public static int name(int arr[]) {

		int sum_of_all = 0;
		int sum_of_N_minus_Two_Natural_nos = 0;
		for (int i = 0; i < arr.length; i++) {
			sum_of_all += arr[i];
		}
		for (int i = 1; i <= arr.length - 2; i++) {
			sum_of_N_minus_Two_Natural_nos += i;
		}

		return sum_of_all - sum_of_N_minus_Two_Natural_nos;
	}

	public static void main(String[] args) {
int arr[] = {5,7,8,1,7,6,3,9};
		System.out.println(name(arr));
	}
}
