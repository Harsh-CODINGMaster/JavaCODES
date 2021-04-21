import java.util.HashMap;

public class LargestSubsetSubArrayZero {
	public static int Zero(int arr[]) {
		int max_length = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int i = -1;
		int sum = 0;
		map.put(sum, i);
		while (i < arr.length - 1) {
			i++;
			sum += arr[i];
			if (map.containsKey(sum) == false) {
				map.put(sum, i);

			}

			else {
				int len = i - map.get(sum);
				if (len >max_length) {
					max_length = len;
				}
			}
		}
		return max_length;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		int f = Zero(arr);
		System.out.println(f);
	}
}
