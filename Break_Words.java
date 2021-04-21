
public class Break_Words {
	public static String Breakie_Break(String str) {

		String[] array = str.split(" ", 0);
		System.out.println("INITIAL STRING WAS :-");
		for (String i : array) {
			System.out.println(i);
		}
		System.out.println("STRING AFTER OPERATIONS IS :-");
		String k = "";
		for (int i = 0; i < array.length; i++) {

			if (array[i].length() >= 4 && array[i].length() % 2 == 0) {

				int n = array[i].length();
				for (int j = 0; j < n; j++) {

					if (j == n / 2) {
						k += " ";
					}
					k += array[i].charAt(j);
				}
				if (i < array.length - 1) {
					k += " ";
				}
			} else {
				k += array[i];
				if (i < array.length - 1) {
					k += " ";
				}
			}
		}
		return k;
	}

	public static void main(String[] args) {
		String ans = Breakie_Break("Helloo world good morniing");
		System.out.println(ans);
	}
}
