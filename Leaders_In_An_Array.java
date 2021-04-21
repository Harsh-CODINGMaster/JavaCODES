
public class Leaders_In_An_Array {
	public static void name(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j <=arr.length; j++) {
				//System.out.println("here");
				if (j == arr.length) {
					System.out.println(arr[i]);
					break;
				}
				if (arr[j] < arr[i]) {
					continue;
				} else {
					break;
				}

			}
		}

	}

	public static void main(String[] args) {
int [] arr = {17,15,16,13,14};
System.out.println("Leaders of the array are :");
name(arr);
	}
}
