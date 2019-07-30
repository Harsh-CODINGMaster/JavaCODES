

public class testEmployee_REPORT {

	public static void main(String[] args) {
		
		Employee_REPORT harsh =new Employee_REPORT(1000,"Harsh","DELHI",150000);
	System.out.println("***********************************");
				harsh.printREPORT();
		harsh.setName(harsh.getName()+" Gupta");
System.out.println("New name of Harsh is "+ harsh.getName());	
	System.out.println("***********************************");
	}

}
