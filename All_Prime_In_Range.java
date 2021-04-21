
public class All_Prime_In_Range {
	public static void name(int low, int high) {
		System.out.println("List of prime nos are :-");
		for (int i = low; i <= high; i++) {
			int counter = 0;
			for (int craddle = 2; craddle * craddle <= i; craddle++) {

				if (i % craddle == 0) {
					counter = 1;
					break;
				}

			}
			if (counter == 0) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		name(3, 17);
	}
}
