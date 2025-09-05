package Strings;
import java.util.Scanner;

public class Remove_Given_Char_From_String {
	public static void removeChar(String s, char ch) // This is method which is take input as string and character. remove the character form string.
	{
		String ans = "";
		for(int i=0 ; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(s.charAt(i) != ch) // It checks if the character is not present in string. 
			// If this condition is true then concat that character to ans String.
			{
				ans = ans + c;
			}
		}
		System.out.println(ans);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); // Created an Scanner Object to take input from user.
		System.out.print("Enter a String : "); // Simple String which on concole.
		String s = sc.nextLine(); // Taking input string from user.
		System.out.print("Enter character : "	); // Simple String which on concole.
		char ch = sc.next().charAt(0); // Taking input character from user.
		removeChar(s, ch); // calling method

	}
}
