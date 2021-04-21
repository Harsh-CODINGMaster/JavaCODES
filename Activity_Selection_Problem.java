import java.util.ArrayList;
import java.util.Arrays;

public class Activity_Selection_Problem {
	public static ArrayList<Integer> Algo(int start[], int finish[], int n) {
		ArrayList<Integer> link = new ArrayList<>();
		int no_of_activities = n;
		Arrays.sort(finish);
		link.add(1);
		int x = 0;
		for (int k = 1; k < no_of_activities; k++) {
			if (start[k] >= finish[x]) {
				link.add(k + 1);
				x = k;
			}
		}
		return link;
	}

	public static void main(String[] args) {
		int n = 9;
		int start[] = { 1, 2, 4, 1, 5, 8, 9, 11, 13 };
		int finish[] = { 3, 5, 7, 8, 9, 10, 11, 14, 16 };
		ArrayList<Integer> ans = Algo(start, finish, n);
		System.out.println("Following are the activities no:");
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
