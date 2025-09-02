package Strings;
//	Segegrate Vowels and Consonants form the string.
public class SegegrateVovelsConsonents {
	public static void main(String args[])
	{
//		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		String s = "Aeropl1a2n34e5";
		String vowel = "";
		String cons = "";
		for(int i=0 ; i<s.length(); i++)
		{
			
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') // it will only allow the characters not special character or number.
			{
				if(ch=='a' || ch=='A' ||
				   ch=='e' || ch=='E' ||
				   ch=='i' || ch=='I' ||
				   ch=='o' || ch=='O' ||
				   ch=='u' || ch=='U') // It will check upper and lower both vowels.
				{
					vowel = vowel + ch; 
				}
				else
				{
					cons = cons + ch;
				}
			}
		}
		System.out.println(vowel);
		System.out.println(cons);
	}
}
