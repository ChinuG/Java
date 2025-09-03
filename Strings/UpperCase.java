package Strings;
// Cpnvert the give string into Upper Case.
public class UpperCase {
	public static void main(String args[])
	{
		String s = "India IS a BEautiFul CounTRY";
		
		System.out.println(upperCase(s));
	}
	
	public static String upperCase(String s) // Method.
	{
		String ans = "";
		for(int i=0 ; i<s.length() ; i++)
		{
			char ch = s.charAt(i); // charaAt(i) means Character at index (i) stores in character ch variable.
			if(ch>='a' && ch<='z')
			{
				ans = ans + (char)(ch-32); // here done narrowing. (ch-32) gives int we need to convert into character so done narrowing. 
				// current character in ch - 32
				// in this if statement value of ch comes from lowercase 'a' to 'z' 
				// So need to convert into Upper Case. 
				// gap between Uppercase and Lowercase in ASCII value is 32 i.e. 'A' = 65 and 'a' = 97
				// So if in string 'a' is character we need to convert into 'A' we need to do 'a' - 32, i.e. 97 - 32 = 65
				// So ASCII value of 65 is UpperCase 'A'
				// That's whey that
			}
			else // if character is already is in Upper case direct concate to old string. i.e. ans String
			{
				ans = ans + ch;
			}
		}
		return ans;
	}
}
