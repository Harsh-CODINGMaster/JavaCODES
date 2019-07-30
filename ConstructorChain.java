
 class A{
	int x = 100;
	A(){
		System.out.println("A Default Cons Call ");
	}
	A(int x){
		this();
		System.out.println("A Param Cons Call ");
	}
}
class B extends A{
	int x = 200;
	B(){
		//super();
		System.out.println("B Default Cons Call ");
	}
	B(int x){
		// super();
		super(100);
		int z = x + this.x + super.x ;
		System.out.println("B Param Cons Call " + z); 
	}
}

public class ConstructorChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(100);

	}

}
