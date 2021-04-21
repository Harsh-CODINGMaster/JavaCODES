import java.util.Stack;

public class BalancedParanthesis {

	public boolean BP(String input) {
		Stack<Character> s = new Stack<>();
		if (input == null) {
			return false;
		}
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				s.push(c);
				System.out.println("push called");
			continue;
			}
			if (s.isEmpty()) {
				return false;
			} else if (c == ')' || c == '}' || c == ']') {

					char top_char = s.pop();

					if ((top_char == '{' || top_char == '[') && c == ')') {

						return false;

					} else if ((top_char == '{' || top_char == '(') && c == ']') {
						return false;
					} else if ((top_char == '[' || top_char == '(') && c == '}') {
						return false;
					} 
				
			}
		}
		return (s.isEmpty());

	}

	public static void main(String[] args) {

		BalancedParanthesis bp = new BalancedParanthesis();
		String input = "({[A+B]})";
		boolean ans = bp.BP(input);
		System.out.println(ans);
	}
}
