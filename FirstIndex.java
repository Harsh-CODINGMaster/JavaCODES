
public class FirstIndex {

public static int Check(int input, int []arr, int CurrIndex){

	if(CurrIndex==arr.length)
	return -1;
	
	if(arr[CurrIndex]==input)
		return CurrIndex;
		
//	int []SI= new int [arr.length-1];
//	for(int i=1;i<arr.length;i++)
//{ SI[i-1]=arr[i];
//	}
	
	return Check(input, arr,CurrIndex+1);
	
}
public static int Check(int input, int []arr) {
	
	return Check(input, arr,0);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=21;
int arr[]= {12,22,33,44,21};

	System.out.println(Check(input,arr));
	}

}
