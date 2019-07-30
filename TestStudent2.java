import java.math.BigDecimal;	
public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Student2 ram = new Student2(17,"ram kumar",97,98,99);
//ram.TotalMarks();
ram.printSTUDENTdetails();
ram.change();
System.out.println("NEW DETAILS AFTER CHANGING MARKS ARE ");
System.out.println("******************************************************");
ram.printSTUDENTdetails();
BigDecimal big = new BigDecimal(50000000);
Employee2 employee = new Employee2(big.intValue(),"shyam kumar");
employee.printSALARYslip();
	}

}
