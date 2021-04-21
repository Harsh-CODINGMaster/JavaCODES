import java.util.HashMap;

public class First_Non_Repeating_Char {
	public static void First_Unique_Non_Repeat(String input) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) {
				map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
			} else {
				map.put(input.charAt(i), 1);
			}
		}

		// Set<Character> ans = map.keySet();
		// for (char i : ans) {
		for (int i = 0; i < input.length(); i++) {
			if (map.get(input.charAt(i)) != 1) {
				continue;
			} else {
				System.out.println("Fist Non repeating character is " + input.charAt(i));
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		String in = "aAbcDeWDDbbcaaAB";
		First_Unique_Non_Repeat(in);
	}
}
