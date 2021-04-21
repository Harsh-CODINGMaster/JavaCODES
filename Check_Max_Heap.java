
public class Check_Max_Heap {
	public static boolean check_Max_Heap(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int LC = 2 * i + 1;
			int RC = 2 * i + 2;

			if (LC < arr.length && arr[i] < LC) {
				return false;
			}
			if (RC < arr.length && arr[i] < RC) {
				return false;
			}

		}
	return true;
	}

	public static void main(String[] args) {

	}
}

