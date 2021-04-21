import java.util.Arrays;
import java.util.HashMap;

public class arrayint {
	public static void name(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();

		Arrays.sort(arr1);

		for (int i : arr1) {
			if (map1.containsKey(i)) {
				map1.put(i, (map1.get(i)) + 1);
			} else {
				map1.put(i, 1);
			}
		}

		for (int i : arr2) {
			if (map2.containsKey(i)) {
				map2.put(i, (map2.get(i)) + 1);
			} else {
				map2.put(i, 1);
			}
		}

		for (int i : arr1) {
			if (map2.containsKey(i) && map2.get(i) >= 1) {
				System.out.print(i);
				map2.put(i, map2.get(i) - 1);
			}

		}

	}

	public static void main(String[] args) {
int arr1[] = {2,6,1,2};
int arr2[] = {1,2,3,4,2};
name(arr1, arr2);
	}
}
