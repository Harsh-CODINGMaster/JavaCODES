
public class Cricketer {
	int numberOfHundred;
	String name;
	int strikeRate;
	int noOfDucks;
	 public void takeInput(int numberOfHundred, String name, int strikeRate, int noOfDucks ){
		this.noOfDucks = noOfDucks;
		this.name = name;
		this.strikeRate = strikeRate;
		this.numberOfHundred = numberOfHundred;
	}
	public void star() {
		System.out.println("*****************************************");
	}
	public void print(){
		// this 
		System.out.println("Name is "+this.name);
		System.out.println("Strike Rate is "+strikeRate);
		System.out.println("No of Hundreds is "+numberOfHundred);
		System.out.println("NO of Ducks is "+noOfDucks);
	}

}
