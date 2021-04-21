
public class CheckSorted {

	public static boolean CheckSorted(int [] input) {
	if(input.length<=1)
	{return true;
		
	}
	
	int smallInput [] = new int [input.length-1];
	for(int i=1;i<input.length;i++)
	{
		smallInput[i-1]=input[i];
		
	}
	boolean SmallAns = CheckSorted(smallInput);
	
	if(!SmallAns) return false;
	
	if(input[0]<=input[1])
		return true;
	
	else { return false; }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []input = {2,1,3};
	System.out.println(CheckSorted(input));
	
	}

}
