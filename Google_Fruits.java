import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Google_Fruits {
	public static int name(ArrayList<Integer> list, int k) {
		int i = -1;
		int j = -1;
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		while (true) {
			boolean f1 = false;
			boolean f2 = false;
			while (i < list.size() - 1) {
				// System.out.println("hi1");
				f1 = true;
				i++;
				int ch = list.get(i);
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);

				} else {
					map.put(ch, 1);
				}

				if (map.size() <= k) {
					// it means all ok till now so find length side by side ... UPDATE LENGTH
					int len = i - j;
					if (max < len) {
						max = len;
					}
				} else {
					break;// go to releasing stage
				}
			}
			while (j < i) {
				// System.out.println("hi2");
				f2 = true;
				j++;
				int ch = list.get(j);
				if (map.get(ch) == 1) {
					map.remove(ch);

				} else {
					map.put(ch, map.get(ch) - 1);
				}
				if (map.size() > k) {
					continue; // still more releasing reqd ...
				} else { // update length
					int len = j - i;
					if (max < len) {
						max = len;
					}
					break;
				}
			}
			if (f1 == false && f2 == false) {
				break;
			}

		}
		return max;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		// 3,3,3,1,2,1,1,2,3,3,4
//		list.add(3);
//		list.add(3);
//		list.add(3);
//		list.add(1);
//		list.add(2);
//		list.add(1);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(3);
//		list.add(4);
		int n = 5;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		for (int k = 0; k < 5; k++) {
			System.out.println(list.get(k));
		}
		//System.out.print(name(list, 2));
	}
}
