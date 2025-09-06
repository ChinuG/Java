package Strings;

public class StringPalindrom {
	public static void main(String args[])
	{
		String s = "madam";
//		String s = "abccba";
		String rev = "";
		for(int i=s.length()-1 ; i>=0 ; i--)
		{
			rev = rev + s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
