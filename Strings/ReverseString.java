package Strings;
//	Revers the given String
public class ReverseString {
	public static void main(String args[])
	{
		String str = "Hello yamnihC";
		
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			System.out.print(str.charAt(i)); // charAt() is inbuilt method of String.
		}
		
		System.out.println();
		String rev = "";
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}
}
