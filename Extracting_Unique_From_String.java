import java.util.HashMap;

public class Extracting_Unique_From_String {
	public static String remove(String input) {
		String ans = " ";

		HashMap<Character, Boolean> check = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (check.containsKey(input.charAt(i))) {
				continue;
			} else {
				ans = ans + input.charAt(i);
				check.put(input.charAt(i), true);
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		String to_be_checked = "abcdaabbddabsbsaeghiij";
		String final_ans = remove(to_be_checked);
		System.out.println(final_ans);
	}
}
