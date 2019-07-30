
interface DB1{
	void show();
	void ice();
	int x=10;
	
}


 class InterfaceTrial1 implements DB1 {

	@Override
	public void show() {
		
		
	}

	@Override
	public void ice() {
		
		
	}

	

}
public class InterfaceTrial{
	
	public static void main(String [] args)
	{
		InterfaceTrial1 T = new InterfaceTrial1();
	System.out.println(T.x);
	}
	
}
