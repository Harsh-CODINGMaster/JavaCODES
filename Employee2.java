import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
public class Employee2 {
private int	 BasicSalary;
//private BigDecimal hra;
//private BigDecimal da;
//private BigDecimal ta;
//private BigDecimal gs;
//private BigDecimal pf;
private String name;
public Employee2(int BasicSalary,String name) {
	this.BasicSalary=BasicSalary;
	this.name=name;
	// TODO Auto-generated constructor stub
}

//Employee(BigDecimal	 BasicSalary,String name){
//	this.BasicSalary=BasicSalary;
//	this.name=name;
//	
//}

double hra() {
//BigDecimal bs = new BigDecimal(0.30);

	 return BasicSalary*0.30;
}
double da() {
	return BasicSalary*0.20;
}
double ta() {
	return BasicSalary*0.10;
}
double pf() {
	return BasicSalary*0.05;
}
double tax() {
	return gs()*0.10;
}
double gs() {
	return BasicSalary+hra()+ta()-pf();
}
double ns() {
return gs()-tax();	
}
//BigDecimal da() {
//	BigDecimal bigdecimal = new BigDecimal(0.20);
//	 da = bigdecimal.multiply(BasicSalary);
//	 return da;
//}
//BigDecimal ta() {
//	BigDecimal bigdecimal = new BigDecimal(0.10);
//	 ta = bigdecimal.multiply(BasicSalary);
//	 return ta;
//}
//BigDecimal pf() {
//	BigDecimal bigdecimal = new BigDecimal(0.05);
//	 pf = bigdecimal.multiply(BasicSalary);
//	 return pf;
//}
//BigDecimal gs() {
//	BigDecimal bigdecimal = new BigDecimal(0.05);
//	 gs = bigdecimal.multiply(BasicSalary);
//	 return gs;
//}

//Student shyamu = new Student();

public void printSALARYslip() {
	CommonFORboth2 cm1 = new CommonFORboth2();
	NumberFormat nf = NumberFormat.getInstance(Locale.US)	;
	System.out.println("***************EMPLOYEE DETAILS ARE AS FOLLOWS***************");
	System.out.println("Employee name is "+cm1.toTitleCase(this.name));
	System.out.println("Employee salary is "+nf.format(this.BasicSalary));
	System.out.println("Employee hra is  "+nf.format(hra()));
	System.out.println("Employee da is "+nf.format(da()));
	System.out.println("Employee ta is  "+nf.format(ta())); 
	System.out.println("Employee pf is  "+nf.format(pf())); 
	System.out.println("Employee gs is  "+nf.format(gs()));
}
}
