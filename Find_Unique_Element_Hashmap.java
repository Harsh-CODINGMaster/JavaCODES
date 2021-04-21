import java.util.HashMap;

public class Find_Unique_Element_Hashmap {
	public static int Time_On(int arr[]) {
		int sum_of_all_once_singly = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				sum_of_all_once_singly += arr[i];
				map.put(arr[i], 1);
			}
		}
		int sum_of_all_elements_array = 0;
		for (int i = 0; i < arr.length; i++) {
			sum_of_all_elements_array += arr[i];
		}
		return 2 * (sum_of_all_once_singly) - (sum_of_all_elements_array);
	}

	public static void main(String[] args) {
		int arr[] = { 9, 1, 2, 2, 3, 1, 5, 9, 7, 8, 6, 7, 6, 5, 8, };
		System.out.println("The unique element in array is :");
		System.out.println(Time_On(arr));
	}
}
