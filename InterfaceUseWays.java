
//SAM Interface
@FunctionalInterface
interface I{
	int add(int x, int y);
	
}
class I2 implements I{

	@Override
	public int add(int x, int y) {
	
		return x+y;
	}

	
}
public class InterfaceUseWays {
	static void print2(){
	//	I e =(a,b)->a+b;
		I e = (a,b)->{
			System.out.println("A is "+a+" B is "+b);
			return a + b;
		};
		System.out.println("Lambda "+e.add(1000, 2000));
//		
//	}
//	static void print(){
//		I e = new I(){
//			@Override
//			public int add(int x , int y){
//				return x + y;
//			}
//		};
//		
		
//		System.out.println("Anonymous Class Result is "+e.add(100, 200));
	}
	public static void main(String[] args) {
//		print();
		print2();
		
		
	}//END OF MAIN ***************

}//end of INTERFACE USE WAYS CLASS.........