
public class AllPossibleWays {

	public static int allPossibleWays(int k , int x, int n) {
	
		int rest =(int)( x - Math.pow(k, n));
		if(rest ==0) {return 1;}
		if(rest<0) {return 0;}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int z=0;
int x=10;
int n=2;
for(int i=1;i<x;i++) {
	z=z+allPossibleWays(i, x, n); 
}
		
	}

}
