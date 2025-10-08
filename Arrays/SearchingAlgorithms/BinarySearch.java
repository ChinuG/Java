package SearchingAlgorithms;

public class BinarySearch {
	public static void binarySearch(int ar[], int search)
	{
		BubbleSort.bubbleSort(ar);
		int start = 0, end = ar.length-1, mid = (start+end)/2;
		while(start <= end)
		{
			if(ar[mid] == search)
			{
				System.out.print("Element found at index : " + mid);
				break;
				
			}
			else if(search > ar[mid])
			{
				end = mid+1;
			}
			else if(search < ar[mid])
			{
				end = mid-1;
			}
			mid = (start+end)/2;
		}
		if(start > end)
		{
			System.out.print("Element not found");
		}
		
	}
	public static void main(String args[])
	{
		int ar[] = {2, 5, 15, 31, 42, 73, 86, 91, 99, 102, 286};
		binarySearch(ar, 73);
	}
}
