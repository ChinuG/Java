//	Write a program to print all even position of an given array.

package Arrays;

public class EvenPosition {
	public static void main(String args[])
	{
		int arr[] = {3, 34, 6, 4, 7, 4, 3};
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
