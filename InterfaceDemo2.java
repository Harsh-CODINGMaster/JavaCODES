
 interface DB{
	 void show();
	 default void icecream() {
		 System.out.println("EAT...");
	 }
 }
 
 class A2 implements DB{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	 
	 
 }