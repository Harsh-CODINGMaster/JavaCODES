
public class Check_Palin_Integer {
	public static void Plain(char arr[]) {

		int i = 0;
		int c = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] != arr[j]) {
				c = 1;
				break;
			} else {
				i++;
				j--;
			}
		}
		if (c == 1) {
			System.out.println("NOT PALIN");
		} else
			System.out.println("PALIN");
	}

	public static void main(String[] args) {
		int input[] = { 1, 2, 2, 1 };
		char input1[] = {'a','b','a'};
		Plain(input1);
	}
}
