
public class Student3 {

private int rollno;
private int MARKS_English;
private int MARKS_Math;
private int MARKS_Hindi;
private String name;
private int totalmarks;
public int TotalMarks() {
	return this.MARKS_English+this.MARKS_Math+this.MARKS_Hindi;
	//System.out.println("total are"+totalmarks);
}
public float percentage() {
	return ((1.0f*TotalMarks()/300)*100);
}
public char grade() {
	char GRADE='A';
	if (percentage()>=90) 
	{GRADE='A';}
	if (percentage()>70 && percentage()<90) 
	{GRADE='B';}
	
	if (percentage()<70 && percentage()>60) 
	{GRADE='C';} 
	
	else if(percentage()<60)
	GRADE='F';
	return GRADE;
}

//public int finalname() {
//	String[] arr = this.name.split(" ");
//	this.name = "";
//	for (String s1 : arr) {
//		this.name += WordUtils.capitalize(s1.toLowerCase()) + " ";
//	}
//	this.name = this.name.substring(0, this.name.length() - 1);
//	return this.name;}
public void printSTUDENTdetails() {
	CommonFORboth2 cm = new CommonFORboth2();
	System.out.println("STUDENT REPORT CARD IS:");
	System.out.println("ROLL NO IS "+this.rollno);
	System.out.println("NAME IS "+ cm.toTitleCase(this.name));
	System.out.println("MARKS IN ENG ARE "+this.MARKS_English);
	System.out.println("MARKS IN MATH ARE "+this.MARKS_Math);
	System.out.println("MARKS IN HINDI ARE "+this.MARKS_Hindi);
System.out.println("TOTAL MARKS ARE "+TotalMarks());
System.out.println("PERCENTAGE IS "+percentage());
System.out.println("GRADE IS "+grade());
 
	
	
}
public void change() {
	this.MARKS_English+=5;
	this.MARKS_Hindi+=5;
	this.MARKS_Math+=5;
}
Student3(int rollno,String name,int MARKS_English,int MARKS_Math,int MARKS_Hindi){
	this.rollno=rollno;
	this.name=name;
	this.MARKS_English=MARKS_English;
	this.MARKS_Hindi=MARKS_Hindi;
	this.MARKS_Math=MARKS_Math;
}
}
