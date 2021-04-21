public class AllIndexing { 
  
    public static int[] AllIndexesRecursive(int input[], 
                                int x, int start) 
    { 
        if (start == input.length) { 
            int[] ans = new int[0]; // empty array 
            return ans; 
        } 
  
        
        int[] smallIndex = AllIndexesRecursive(input, x, 
                                              start + 1); 
  
        if (input[start] == x) { 
            int[] myAns = new int[smallIndex.length + 1]; 
  
           
            myAns[0] = start; 
            for (int i = 0; i < smallIndex.length; i++) { 
                  
               
                myAns[i + 1] = smallIndex[i]; 
            } 
            return myAns; 
        } 
        else { 
              
            
            return smallIndex; 
        } 
    } 
  
    public static int[] AllIndexes(int input[], int x) 
    { 
  
        return AllIndexesRecursive(input, x, 0); 
    }

    public static void main(String[] args) {
		int [] input = {12,12,13};
		int x =12;
		int op[]= AllIndexes(input, x);
		
		for(int i=0;i<op.length;i++)
		{
			System.out.println(op[i]+" ");
		}
	}
}