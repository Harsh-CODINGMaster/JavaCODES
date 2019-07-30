class Person{
	int id ;
	String name;
	
	Person(int id,String name){
		this.id=id;
		this.name=name;
		
	}

}
class M{
	
	void show() {
		System.out.println("M show...");
	}
	
}
class N extends M{
@Override
protected void show() {
	System.out.println("N show...");
	
}Person print(){
Person p = new Person(1001, "HARSH");
return p;
}
}
	
	
public class OverRIDE {
public static void main(String[] args) {
N m = new N();
Person per =m.print();
System.out.println(per.id);
System.out.println(per.name);
	
}
}
