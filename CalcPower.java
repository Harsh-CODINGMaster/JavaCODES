
public class CalcPower {

	public static int power(int x,int n) {
		
		if(n==0) { return 1; } 
		return (x*power(x,(n-1)));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=3 , b=4;
System.out.println(power(a, b));
	}

}
