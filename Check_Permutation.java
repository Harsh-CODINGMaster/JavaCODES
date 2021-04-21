
public class Check_Permutation {
	public static boolean Check(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		int arr1[] = new int[256];
		int arr2[] = new int[256];
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			arr1[s1.charAt(i)]++;
			arr2[s2.charAt(i)]++;
		}
		for (int i = 0; i < 255; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "aba";
		String s2 = "bab";
		boolean ans = Check(s1, s2);
		System.out.println(ans);
	}
}
