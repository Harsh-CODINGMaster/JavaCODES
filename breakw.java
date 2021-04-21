public class breakw 
{
    public static String breakWords(String input)
    {
        String w = "";
        String ans = "";

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) != ' ')
            {
                w = w + input.charAt(i);
                if((w.length() >= 4) && (w.length() % 2 == 0))
                {
                    int a = w.length()/2;
                    ans = ans + w.substring(0, a) + " " + w.substring(a, w.length());
                    w = "";
                }
                else
                {
                    ans = ans + input.charAt(i);
                }
            }
            
            else
            {
                ans = ans + input.charAt(i);
                w = "";
            }
        }
        return ans;
    }
public static void main(String[] args) {
	String ans = breakWords("Helloo world good morniing");
	System.out.println(ans);
}
}