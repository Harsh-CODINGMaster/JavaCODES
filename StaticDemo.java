
import java.util.Scanner;

class D{
	static {
		System.out.println("I m static block of class D...");
	}
	
}
class CUSTOMER{
	
	int id;
	String name;
	static String offers;
	
	CUSTOMER(){
		
	System.out.println("I get call every time when object is created...");
	}
	static {
		// name = "harsh";   HERE IT IS WRONG..
		offers="50% OFF";
		System.out.println("I m static block and I am called when class gets loaded..."+ offers);
	System.out.println("CUSTOMER.offers= "+ CUSTOMER.offers);
	}
}
public class StaticDemo {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Enter the class name for which u want to see d static block...");
		Scanner s = new Scanner(System.in);
		String className = s.nextLine();
		
		//String className = new Scanner(System.in).next();
		
		Class.forName(className);
	}

}
