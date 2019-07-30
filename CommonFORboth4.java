
public class CommonFORboth4 {
	public static String toTitleCase(String str) {
	    
	    if(str == null || str.isEmpty())
	        return "";
	    
	    if(str.length() == 1)
	        return str.toUpperCase();
	    
	    String[] parts = str.split(" ");
	    
	    StringBuilder sb = new StringBuilder( str.length() );
	    
	    for(String part : parts){

	        char[] charArray = part.toLowerCase().toCharArray();
	        charArray[0] = Character.toUpperCase( charArray[0] );
	        
	        sb.append( new String(charArray) ).append(" ");
	    }
	    
	    return sb.toString().trim();
	}
}
