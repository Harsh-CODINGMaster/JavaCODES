
public class Bookstore {
	public static void name(String str) {
		int last_openeing = 0;
		int first_closing = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '/') {
				last_openeing = i;
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if ((int) str.charAt(i) == 92) {
				first_closing = i;
				break;

			}
		}
		StringBuffer chk = new StringBuffer(str.subSequence(last_openeing+1,first_closing ));
		chk.reverse();
		
		String ans = reverse_word(str, last_openeing, first_closing);
	}

public static String reverse_word(String str, int start, int end) {
	
	for(int i=start+1,j=end-1;i<=j;i++,j--) {
		char temp = str.charAt(i);
		
	}
	
	return str;
	
}

}

	public static void main(String[] args) {

	}
}
