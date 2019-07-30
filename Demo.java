
import java.util.Scanner;


//X1-->X2-->X3;
class X1
{
	int x;
	X1(){
		x = 100;
	}
}
class X2 extends X1{
	int x;
	X2(){
		x = 200;
	}
}
class X3 extends X2{
	int x ;
	X3(){
		x = 300; 
		int z  = ((X1)this).x + ((X2)this).x /*or super.x same thing*/ + this.x;
		System.out.println("Z is "+z); 
	}
}

public class Demo {

	public static void main(String[] args) {
		
		X3 obj = new X3();


	}//end of main

}//END OF CLASS DEMO