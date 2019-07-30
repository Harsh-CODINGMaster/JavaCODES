
import java.util.Scanner;

 class EmployeeREPORT1 {
private int id;
private String name;
private int salary;

void employeedetails(int id,String name,int salary)
{
	this.id=id;
	this.name=name;
	this.salary=salary;
	
	}
void printsalaryslip()
{ System.out.println("Basic salary is "+salary);
System.out.println("Name is "+name);
System.out.println("ID is "+id);
System.out.println("HRA is "+hra());
System.out.println("DA is "+da());
System.out.println("TA is "+ta());
System.out.println("GS is "+gs());
System.out.println("PF is "+pf());
System.out.println("TAX is "+tax());
System.out.println("NS is "+ns());

}
double hra()
{ return salary*0.30;
	}

double da()
{
	return salary*0.20;
}

double ta()
{
	return salary*0.10;
	}

double pf()
{
	return salary*0.05;
	}
 double gs()
 {
	 return salary+hra()+da()+ta()-pf();
	
 }
 
 double tax()
 {
	 return 0.10*gs();
 }
 double ns()
 {
	return gs()-tax();
 }
 }
public class TESTEmployeeREPORT {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("Enter the id...");
	int id = s.nextInt();
	System.out.println("Enter the name...");
	s.nextLine();
	String name =s.nextLine();
	System.out.println("Enter the basic salary...");
	int salary = s.nextInt();
	s.close();
	
	EmployeeREPORT1 x =new EmployeeREPORT1();
	x.employeedetails(id, name, salary);
	x.printsalaryslip();
	}

}
