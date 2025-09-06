package Strings;

public class NumberPalindrome {
	public static void main(String args[])
	{
		int n = 123321;
		int nCopy = n;
		int reverse = 0;
		while(n > 0)
		{
			int last = n % 10;
			reverse = reverse * 10 + last;
			n = n / 10;
		}
		
		if(nCopy == reverse)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
