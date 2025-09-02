package Strings;

import java.util.Arrays;

public class StringToArray {
	public static void main(String args[])
	{
		String s = "I am The Best";
		// We take here character array because String is collections of characters. If we take int or float or any other data type it will print the ASCII value of each character.
		char ch[] = new char[s.length()]; // Creates an character array of string s length.
		for(int i=0 ; i<s.length() ; i++) // iterate string from 0 to string length
		{
			ch[i] = s.charAt(i); // store every character in character array.
		}
		System.out.println(Arrays.toString(ch)); // Print character array.
	}
}
