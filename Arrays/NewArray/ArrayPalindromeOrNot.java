package NewArrays;

import java.util.Arrays;

public class ArrayPalindromeOrNot {
	public static void palindromeAr(int ar[])
	{
		int temp[] = new int[ar.length];
		for(int i=0 ; i<ar.length ; i++)
		{
			temp[ar.length-1-i] = ar[i];
		}
		int i=0 ; 
		while(i<ar.length)
		{
			if(ar[i] != temp[i])
			{
				System.out.println("Not Palindrome");
				return;
			}
			i++;
		}
		System.out.println("palindrome");				
		System.out.println(Arrays.toString(temp));
	}
	public static void main(String args[])
	{
		int ar[] = {12,23,34,34,23,12};
		palindromeAr(ar);
	}
}
