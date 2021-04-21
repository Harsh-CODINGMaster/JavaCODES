
public class All_Permutations_Of_String {

	public static void permutate(String input) {
		name(input, " ");
	}

	public static void name(String ques, String asf) {

		if (ques.length() == 0) {

			System.out.println(asf);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String leftpart = ques.substring(0, i);
			String rightpart = ques.substring(i + 1);
			String finalAppend = leftpart + rightpart;
			name(finalAppend, asf + ch);

		}

	}

	public static void main(String[] args) {
		String input = "abc";
		permutate(input);
	}
}
