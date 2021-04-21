
public class CheckPalin {
	
	public static boolean isStringPalindrome(String input) 
	{
	if(input.length() == 0 || input.length() == 1)
        return true; 
    if(input.charAt(0) == input.charAt(input.length()-1))
    return isStringPalindrome(input.substring(1, input.length()-1));
	return false;
 	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test = "racecar";
System.out.println(isStringPalindrome(test));
	}

}
