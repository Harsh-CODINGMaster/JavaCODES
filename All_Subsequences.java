import java.util.ArrayList;

public class All_Subsequences {
	static ArrayList<String> ans = new ArrayList<>();

	public static void Recursion(String input, String output) {

		if (input.length() == 0) {
			ans.add(output);
			return;
		}

		Recursion(input.substring(1), output + input.charAt(0));
		Recursion(input.substring(1), output);

	}

	public static void main(String[] args) {
		Recursion("abcd", "");
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
