
public class Diagnols_Matrix {
	public static void Print_Diagnol_Of_A_Matrix(int arr[][]) {

		for (int gap = 0; gap < arr.length; gap++) {
			for (int i = 0, j = gap; j < arr.length; i++, j++) {
				System.out.println(arr[i][j]);
			}
		}

	}

	public static void main(String[] args) {
//int input[][] = {{00,01,02,03,04,05},{},{},{},{},{}};

		// filling of 2d array with indexes ...

		int input[][] = new int[6][6];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				String s1 = Integer.toString(i);
				String s2 = Integer.toString(j);
				// concatenating two integer values...
				int c = Integer.parseInt(s1 + s2);

				input[i][j] = c;

			}
		}
		Print_Diagnol_Of_A_Matrix(input);

	}
}
