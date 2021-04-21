import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Chetan_COnnected {

	public static ArrayList<Integer> printDFSHelper(int edges[][], int sv, boolean visited[], ArrayList<Integer> b) {

		b.add(sv);
		visited[sv] = true;
		int n = edges.length;
		for (int i = 0; i < n; i++) {
			if (edges[sv][i] == 1 && !visited[i]) {
				printDFSHelper(edges, i, visited, b);

			}

		}
		return b;

	}

	public static void DFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];

		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < edges.length; i++) {
			if (!visited[i]) {
				ArrayList<Integer> b = new ArrayList<>();
				ArrayList<Integer> smallAns = printDFSHelper(edges, i, visited, b);

				ans.add(smallAns);

			}
		}

		for (int i = 0; i < ans.size(); i++) {
			Collections.sort(ans.get(i));
		}
		print(ans);
	}

	public static void print(ArrayList<ArrayList<Integer>> ans) {
		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < ans.get(i).size(); j++) {
				System.out.print(ans.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		int[][] edges = new int[V][V];

		for (int i = 0; i < E; i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();

			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}

		DFS(edges);

	}

}