

public class TestStudent_REPORTcard{

	public static void main(String[] args) {
				int marks [] = {100,90,70};
		Student_REPORTcard ram =new Student_REPORTcard(1001,"Ram",marks);
		
		ram.print();
		ram.setName(ram.getName()+" Kumar");
		System.out.println("new name of ram is "+ram.getName());
		System.out.println("*********************************");
//		
//		ram.takeInput(100, "Ram", marks);
//		ram.print();
//		ram.rollno = -1001;
//		int marks [] = {-100,-200,-300};
//		ram.marks  = marks;
//		System.out.println(ram.rollno);
//		for(int mark : marks)
//			System.out.println(mark);
//		}
	

	}

}