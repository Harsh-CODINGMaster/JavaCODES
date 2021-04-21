import java.util.HashMap;

public class ExtractUniqueCharacters {

	public static String remove(String str) {
		String ans = " ";

		HashMap<Character, Boolean> seen = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (seen.containsKey(str.charAt(i))) {
				continue;
			} else {
				ans = ans + str.charAt(i);
				seen.put(str.charAt(i), true);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String test = "absbdbabababdssdc";
		String finalAns = remove(test);
		System.out.println(finalAns);
	}
}
