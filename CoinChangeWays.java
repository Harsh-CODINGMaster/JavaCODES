
public class CoinChangeWays {
  public static int CoinChanger(int []money,int m,int n)
  {
	  int arr[] = new int [n+1];
	  arr[0]=1;
	  for(int i=0;i<m ;i++)
	  for(int j=money[i];j<=n;j++)
	  {
		  arr[j]=arr[j]+arr[j-money[i]];
		  
	  }
	  
	  
	  return arr[n];
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []money= {1,2,3};
	int m = money.length;
	int n=4;
	System.out.println(CoinChanger(money, m, n));
	}

}
