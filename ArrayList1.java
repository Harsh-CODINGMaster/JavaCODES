import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=0;i<list.size() ;i++)
//		list.add(i);
//		for(int i=0;i<list.size() ;i++)
//			System.out.println(list.get(i));
	
	list.add(12);
	list.add(23);
	list.add(1,50);
	list.add(45);
	
	for(int element : list)
		System.out.println(element);
	}
}
