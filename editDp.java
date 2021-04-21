public class editDp{
	
	public static int editDistanceDP(String s , String t) {
		int m = s.length();
		int n = t.length();
		int storage[][]= new int [m+1][n+1];
		for(int j=0;j<=n;j++)
		{storage[0][j]=j;}
		for(int j=0;j<=m;j++)
		{storage[j][0]=j;}
		
	for(int i =1;i<=(m);i++)
		for(int j=1;j<=n;j++)
		{
			if(s.charAt(m-i)==t.charAt(n-j)){
storage[i][j]=storage[i-1][j-1];
		}
			else {
				
			
			storage[i][j]= 1+ Math.min(storage[i][j-1], Math.min(storage[i-1][j], storage[i-1][j-1]));
			}
			}
return storage[m][n];			
		}
	
	public static void main(String[] args) {
		String s = "nusdhcus";
		String t = "ndfnfidf";
		System.out.println(editDistanceDP(s, t));
	}
}