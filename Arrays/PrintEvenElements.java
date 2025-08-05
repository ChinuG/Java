package Arrays;

public class PrintEvenElements {
	public static void main(String args[])
	{
		int arr[] = {3, 4, 5, 6, 1, 2, 3, 6, 7, 8};
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
