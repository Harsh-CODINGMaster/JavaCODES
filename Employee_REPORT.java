

public class Employee_REPORT {

	private int id;
	private String name;
	private double salary;
    private String companyname;
    private String cityname;

    { System.out.println("ID is "+ id);
    	
    	System.out.println("Name is "+ name);
    	System.out.println("Salary is "+ salary);
    System.out.println("City name is "+ cityname);
    System.out.println("THIS WAS INIT BLOCK...");
    System.out.println("***********************************");}
    
   Employee_REPORT(int id,String name,String cityname,double salary)
    {
    	this();
    	if(id<=0) {
  System.out.println("Invalid ID...");  
    return;
    }
    this.name=name;
    this.salary=salary;
    this.id=id;
    this.cityname=cityname;
    }
    Employee_REPORT()
    {
    	companyname="INFOSYS...";
    	
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

public void printREPORT()
{
	System.out.println("Name is "+ name);
    System.out.println("ID is "+ id);
    System.out.println("Salary is "+salary);
    System.out.println("Company Name is "+companyname);
System.out.println("City name is "+ cityname);
System.out.println("HRA is "+ hra());
System.out.println("DA is "+ da());
System.out.println("TA is "+ ta());
System.out.println("GS is "+ gs());
System.out.println("PF is "+ pf());
System.out.println("TAX is "+ tax());
System.out.println("NS is "+ ns());

}

double hra()
{
	return salary*0.30;
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
}}