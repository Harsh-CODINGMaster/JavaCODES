
public class Coin_Change_Combinations {
	public static int name(int amount, int arr[]) {

		int dp[] = new int[amount + 1];
		dp[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i]; j < dp.length; j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		return dp[amount];

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 6 };
		boolean n;
		int j=0;
		while(n){ 
			 j = (int)n; 
			  while(j>1){ 
			    j-=1; 
			  } 
			  n/=2; 
			}  
		System.out.println("Total ways to exchange Rs. 10 are");
		System.out.println(name(10, arr));
	}
}
