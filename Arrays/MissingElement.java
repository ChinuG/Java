package Arrays;

public class MissingElement 
{
	public static void missElement(int ar[])
	{
		int sum = 0;
		int maxElement = ar[0];
		for(int i=0 ; i<ar.length ; i++)
		{
			sum += ar[i];
			if(ar[i] > maxElement)
			{
				maxElement = ar[i];
			}
		}
		int naturalSum = maxElement * (maxElement+1)/2;
		
		int missing = naturalSum-sum;
		if(missing == 0)
		{
			System.out.print("No element is missing");			
		}
		else
		{
			System.out.println("Missing element is : " + missing);
		}
	}
	public static void main(String args[])
	{
//		int ar[] = {6, 1, 2, 4, 5};
		int ar[] = {6, 5, 3, 2, 1};
//		int ar[] = {1, 2, 4, 5, 6};
//		int ar[] = {1, 2, 3, 4, 5, 6};
		missElement(ar);
	}
}
