import java.util.Scanner ;
public class Scanner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		String name  = s.nextLine();
		System.out.println("Enter the Id");
		
		int id = s.nextInt();  
		
		
		System.out.println("Id "+id+" name "+name);
		s.close();


}
}
