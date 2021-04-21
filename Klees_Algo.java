import java.util.ArrayList;
import java.util.Collections;

public class Klees_Algo {
	public static int Klees_Algo(int input[][]) {
		int arr[][] = new int[input.length * 2][2];
		ArrayList<Integer> inp = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				inp.add(input[i][j]);
			}
		}

		for (int i = 0; i < inp.size(); i++) {
			arr[i][0] = inp.get(i);
		}
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 == 0) {
				arr[j][1] = 0;
			} else {
				arr[j][1] = 1;
			}
		}
		int f = 0;
		int k = 0;
		int times = 0;
		int arr1[][] = new int[arr.length][2];
		int small = Integer.MAX_VALUE;
		while (times < 6) {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i][0] < small) {
					small = arr[i][0];
					f = i;

				}

			}
//			System.out.println("k is" + k);
//			System.out.println("f is" + f);
			arr1[k][0] = arr[f][0];
			arr1[k][1] = arr[f][1];
			// System.out.println(arr1[k][1]);
			k++;
			times++;
			arr[f][0] = Integer.MAX_VALUE;
			small = Integer.MAX_VALUE;
		}
		int counter = 0;
		int result = 0;
		int maxLength = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (counter > 0) {
				result += arr1[i][0] - arr1[i - 1][0];
			}
			if (counter == 0) {
				if (maxLength < result) {
					maxLength = result;
					result = 0;
				}
			}
			if (arr1[i][1] == 0) {
				counter++;
			} else if (arr1[i][1] == 1) {
				counter--;
			}

//			System.out.println("Result is " + result);
//			System.out.println("counter " + counter);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		int input[][] = { { 2, 5 }, { 4, 8 }, { 9, 12 } };
		// Klees_Algo(input);
		System.out.println(Klees_Algo(input));
	}
}
