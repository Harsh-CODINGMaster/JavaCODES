public class Count_Ways_Reach_Nth {

	
	public static int Return_Total_ways(int x) 
    { 
        int[] find_out = new int[x + 1]; 
        find_out[0] = 1; // only one way is there 
        find_out[1] = 1; // only one possible way using 1 step
        find_out[2] = 2; // 2 possible ways either 1,1 or directly 2 steps
  
        for (int i = 3; i <= x; i++) 
            find_out[i] = find_out[i - 1] + find_out[i - 2] + find_out[i - 3]; 
                                
  
        return find_out[x]; 
    }


public static void main(String argc[]) 
    { 
        System.out.println("Total no of ways are: "+Return_Total_ways(4));
        
    }
}