package Arrays;

public class SortedArrayOrNot {
	public static void sortedArray(int ar[])
	{
		boolean isSorted = true;
		for(int i=0 ; i<ar.length-1 ; i++)
		{
			if(ar[i] > ar[i+1])
			{
				isSorted = false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("sorted");
		}
		else
		{			
			System.out.println("Not sorted");			
		}
	}
	public static void main(String args[])
	{
//		int ar[] = {1, 2, 3, 4, 5, 6};
		int ar[] = {21, 2, 3, 4, 6, 5};
		sortedArray(ar);
	}
}

