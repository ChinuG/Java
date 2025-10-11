package NewArrays;
// Write a program to print all the elements in reverse order.
public class ReverseOrder 
{
	public static void reverse(int ar[])
	{
		for(int i=ar.length-1 ; i>=0 ; i--)
		{
			System.out.println(ar[i]);
		}
	}
	public static void main(String args[])
	{
//		int ar[] = {8,7,6,5,4,3,2,1};
		int ar[] = {45, 56, 67, 23, 21,1,2,3,34,90};
		reverse(ar);
	}
}
