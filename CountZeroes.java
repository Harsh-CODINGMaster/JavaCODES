
public class CountZeroes {

	public static int CountZeroes(int n) {
		
		if(n==0) return 0;
		
		return CountZeroes(n/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=200;
System.out.println(CountZeroes(n));
	}

}
