public class KnapsackDP {
	public static int knapsackDP(int []weights, int[]val,int maxWeight) {
		int m = weights.length;
		int n = maxWeight;
		int [][]dp = new int [m+1][n+1];
		for(int i=0;i<m;i++)
		{
			dp[0][i]=0;//filling first row
		}
		for(int i =0;i<n;i++) {
			dp[i][0]=0;// filling first column
		}
		for(int i=1;i<=m;i++)
			for(int j=1;j<=n;j++) {
				if(j>=weights[i-1]) {
					if((dp[i-1][j-(weights[i-1])]+ val[i-1] ) > dp[i-1][j]) {
						dp[i][j]=dp[i-1][j-(weights[i-1])]+ val[i-1];
					}
					else {
						dp[i][j]=dp[i-1][j]   ; // if not sufficient balls then place ans of above row j same i-1
					}	
				} // end of if when j>weights array
				
				else {
					dp[i][j]=dp[i-1][j]; // if not sufficient balls then place ans of above row j same i-1
				}		
			}
		
		
		return dp[m][n];
		
	}
	
	
public static void main(String []a) {
		int [] weights = {6,1,2,4,5};
	int [] values = {10,5,4,8,6};
	int maxWeight = 5;
	System.out.println(knapsackDP(weights,values,maxWeight));
	}
	
	
}