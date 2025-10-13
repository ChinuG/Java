package NewArrays;
// Write a Program to print reverse copy of an Array.
import java.util.Arrays;

public class ReverseCopyArray 
{
	public static void reverseAr(int ar[])
	{
		int temp[] = new int[ar.length];
		int i;
		for(i=0 ; i<ar.length ; i++)
		{
			temp[ar.length-1-i] = ar[i];
//			System.out.print(temp[i] + ", "); // Try to print Array using this print statement. O/P ===> 0, 0, 0, 0, 3, 4, 6, 34, 3, 
		}
//		System.out.print(temp[i] + " "); // Try to print Array using this print statement. o/p 
		System.out.print(Arrays.toString(temp)); // O/p
	}
	public static void main(String args[])
	{
		int ar[] = {3, 34, 6, 4, 3, 6, 7, 4, 3};
		reverseAr(ar);
	}
}
