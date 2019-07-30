
interface DB5{
	void show();
	default void ice() {
		
		System.out.println("HELLO");
	}
	}


class trial implements DB5{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class mytrial {

	public static void main(String[] args) {
		
	trial t = new trial();
    t.ice();
	}

}
