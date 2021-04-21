
public class CheckString {

	public static Boolean Check(String input) {

		if (input.length() == 0)
			return true;

		if (input.charAt(0) != 'a')
			return false;
		if (input.length() >= 3 && "abb".equals(input.substring(0, 3)))
			return Check(input.substring(3));

		else
			return Check(input.substring(1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String harsh = "thankyou";
		System.out.println(harsh.substring(0, 3));
		String ip = "aabb";
		System.out.println(Check(ip));
	}

}
