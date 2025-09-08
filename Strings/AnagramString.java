package Strings;

import java.util.Arrays;
public class AnagramString
{
	
//	What is Anagrams Strings
//	---> Anagram is when two strings contain the same characters in the same frequency, but arranged in a different order.
//	Examples :- 
//	"listen" and "silent" are anagrams.

//	"triangle" and "integral" are anagrams.

//	"hello" and "world" are not anagrams.
	public static boolean isAnagram(String s1, String s2) // Method to check given 2 string are anagrams or not.
	{
		char ch1[] = s1.toCharArray(); // Converting String s1 to character array
		char ch2[] = s2.toCharArray(); // Converting String s2 to character array
		
		Arrays.sort(ch1); // array sorting character array i.e. ch1 inbuilt method
		Arrays.sort(ch2); // array sorting character array i.e. ch2 inbuilt method
		return Arrays.equals(ch1, ch2);
	}
	public static void main(String args[])
	{
		String s1 = "CAT";
		String s2 = "ACT";
		
		if(isAnagram(s1, s2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
	}
}
