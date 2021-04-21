
public class AllSubSequences {

	public static String[] AllSubSeq(String input) {

		if (input.length() == 0) {
			String []ans = {""};
			return ans;
		}
		String []smallAns = AllSubSeq(input.substring(1));

		String[] finalAns = new String[2 * smallAns.length];

		for (int i = 0; i < smallAns.length; i++) {
finalAns[i]=smallAns[i];
		}
for(int i=0;i<smallAns.length;i++)
{
finalAns[i+smallAns.length] = input.charAt(0)+smallAns[i];	
}

	return finalAns;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "xyz";
		String Ans[] =AllSubSeq(input);
		for(int i =0;i<Ans.length;i++)
		{
			System.out.println(Ans[i]);
		}
	
	
	}

}
