
public class Bag_Of_Tokens {
	public static int name(int[] tokens, int P) {
		int i = 0;
		int j = tokens.length - 1;
		int max_points = 0;
		int points = 0;
		while (i <= j) {
			if (P >= tokens[i]) {
				points++;
				P -= tokens[i++];
				max_points = Math.max(max_points, points);
			} else if (points >= 1) {
				points--;
				P += tokens[j--];

			}

			else {
				return max_points;
			}

		}
		return max_points;
	}

	public static void main(String[] args) {
		int tokens[] = { 100, 200, 300, 400 };
		int power=200;
		System.out.println("Max no of points that can be achieved are:-");
		System.out.println(name(tokens, power));
	}
}
