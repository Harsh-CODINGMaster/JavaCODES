
public class LastIndex {

public static int Check(int input, int []arr, int CurrIndex){

	if(CurrIndex<0)
	return -1;
	
	if(arr[CurrIndex]==input)
		return CurrIndex;
		
//	int []SI= new int [arr.length-1];
//	for(int i=1;i<arr.length;i++)
//{ SI[i-1]=arr[i];
//	}
	
	return Check(input, arr,CurrIndex-1);
	
}
public static int Check(int input, int []arr) {
	
	return Check(input, arr, arr.length-1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int input=12;
int arr[]= {12,12,33,12,12};

	System.out.println(Check(input,arr));
	}

}
