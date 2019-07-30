
import java.util.Scanner;

public class ScannerDEMO {

	public static void main(String[] args) {
      
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
		int a= s.nextInt();
        System.out.println("enter the second number");
	int b=s.nextInt();
	System.out.println("enter the name");
	s.nextLine();
	String name=s.nextLine();
	int c=a+b;
	System.out.println("Sum of the 2 nos is "+c);
	System.out.println("                        ");
	System.out.println("Name is "+name);
	
	s.close();
	Scanner s1=new Scanner(System.in);
	System.out.println("enter 3rd no...");
	int d=s1.nextInt();
	System.out.println("3rd no entered is "+d);
	}
	

}
