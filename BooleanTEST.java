import static java.lang.System.out;
class Validation{
	private Validation() {}
	static boolean IFitISBlank(String str){
		if(str==null){
			return true;
		}
		if(str!=null && str.trim().length()==0){
			return true;
		}
		return false;
	}
}

public class BooleanTEST {

	public static void main(String[] args) {
		String name = "h    g";
		//Validation v = new Validation();  private constructor concept...   all cases output...//
		if(Validation.IFitISBlank(name)){
			out.println("Name Can't Be Blank");
		}
		else{
			out.println("Welcome "+name);
		}
	}

}
