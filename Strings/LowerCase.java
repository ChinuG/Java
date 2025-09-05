package Strings;

public class LowerCase {
	public static void lowerCase(String s) // Method of converting a given string into all character into lowercase.
	{
		String ans = "";
		for(int i=0 ; i<s.length() ; i++) // for loop iterates from start to end.
		{
			char ch = s.charAt(i); 
			if(ch >= 'A' && ch <= 'Z') // it check the character is in between Uppercase 'A' to Lowercase 'B'.
			{
				ans = ans + (char)(ch + 32); // here Narrowing is happen when character is in Uppercase.
				// it will convert into Lowercase.
				// if character Uppercase 'A' it wiil conver it into Lowercase 'a'. 
				// ASCII value of Uppercase 'A' is 65 and ASCII value of Lowercase 'a' 97. 
				// i.e. 65 + 32 = 97 it gives in int, we need to conver it into character.
				// So character of 97 is Lowercase 'a'.
				// last step is after converting into lowercase character to concat to old string.
			}
			else
			{
				ans = ans + ch; // it will work as if character is already in lowercase it will directly concat to old string.
			}
		}
		
		System.out.println(ans);
	}
	public static void main (String args[])
	{
		String s = "India IS a BEautiFul CounTRY";

		lowerCase(s); // Method call
	}
}
