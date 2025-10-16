package NewArrays;

public class ArrayPalindromeOrNot_2Pointer {
	public static void palindrome(int ar[])
	{
		int i=0,  j=ar.length-1;
		for(; i<j ; i++, j--)
		{
			if(ar[i] != ar[j])
			{
				break;
			}
		}
		if(i<j)
		{
			System.out.println("Not palindrome");
		}
		else
		{
			System.out.println("It is palindrome");
		}
	}
	public static void main(String args[])
	{
//		int ar[] = {1,2,3,3,2,1};
//		int ar[] = {1,2,3,2,1};
//		int ar[] = {1,2,3};
		int ar[] = {1,2};
		palindrome(ar);
	}
}
