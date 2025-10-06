package Arrays;

public class SecondLargestElement {
	public static void secondLargest(int ar[])
	{
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0 ; i<=ar.length-1 ; i++)
		{
			if(ar[i] > largest)
			{
				secondLargest = largest;
				largest = ar[i];
			}
			else if(ar[i] > secondLargest && ar[i] != largest)
			{
				secondLargest = ar[i];
			}
		}
		System.out.print("Second Largest Element : " + secondLargest);
	}
	public static void main(String args[])
	{
//		int ar[] = {1, 2, 3, 4, 5, 6};
		int ar[] = {-1, -2, -3, -4, -5, -6};
		secondLargest(ar);
		
	}
}
