
public class Arrange_Buildings {
	public static void name_four_Pointer(int n) {
		// DP approach no array no extra space O(1)
//TABLE FILLING BY  4 pointer approach ...
		int old_b_1 = 1;
		int old_space_1 = 1;
		int new_b_2 = 0;
		int new_space_2 = 0;

		for (int i = 1; i <= (n - 1); i++) {
			new_b_2 = old_space_1;
			new_space_2 = old_b_1 + old_space_1;
			old_b_1 = new_b_2;
			old_space_1 = new_space_2;
		}
		System.out.println("Total no of buildings are" + (new_b_2 + new_space_2)*(new_b_2 + new_space_2));

	}

	public static void main(String[] args) {
name_four_Pointer(5);
	}
}
