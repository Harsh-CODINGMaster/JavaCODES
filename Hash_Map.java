import java.lang.*;

public class Hash_Map {

	/**
	 * @author Harsh Gupta
	 */

	public static void main(String[] args) {
		// parameter ch
		char ch = '6';
		// assigns character values
		Character c = Character.valueOf(ch);

		// assign hashcodes of ch
		int i = c.hashCode();

		// prints the character values
		System.out.println("Hashcode of " + ch + " is " + i);
	}
}