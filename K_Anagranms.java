import java.util.HashMap;

public class K_Anagranms {
	public static boolean name(String str1, String str2, int k) {
		if (str1.length() != str2.length()) {
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		// filling by str1...
		for (int i = 0; i < str1.length(); i++) {
			if (map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
			} else {
				map.put(str1.charAt(i), 1);
			}
		}
		// removing by str2...
		for (int i = 0; i < str2.length(); i++) {
			if (map.containsKey(str2.charAt(i))) {
				int freq = map.get(str2.charAt(i));
				if (freq > 0) {
					map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
				}
			}
		}
		// now adding rem frequencies ...
		int count = 0;
		for (char ch : map.keySet()) {
			// System.out.println(i);
			count += map.get(ch);
		}
		if (count <= k) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(name("ababaddccc", "bcbecabacd", 3));
	}
}
