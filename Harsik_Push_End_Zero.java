
public class Harsik_Push_End_Zero {

	public static void push(int[] a) {
		int i = 1;
		while (i < a.length) {
			if (i == 0) {
				i = i + 1;
			}
			if (a[i] == 0 && a[i - 1] != 0) {
				i++;
			}

			else if (a[i] != 0 && a[i - 1] == 0) {
				int temp = a[i];
				a[i] = a[i - 1];
				a[i - 1] = temp;
				i = i - 1;
			}

			else if (a[i] == 0 && a[i - 1] == 0) {
				i++;
			} else {
				i++;
			}
		}

	}

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3 };
		int a1[] = { 1, 2, 4, 3, 0 };
		push(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
