//	Array must be sorted in Ascending order to perform Binary Search.
// 	Search element in 
// 	Used to find an element in a sorted array.
//	Works by repeatedly dividing the search range into half.
//	Needs data to be already sorted before searching.
package Sorting;

public class BinarySearch {
	public static void main(String args[])
	{
		int arr[] = {2, 9, 15, 19, 23, 56, 84, 91, 105, 140, 190};
		binarySearch(arr, 91);
	}
	public static void binarySearch(int arr[], int search)
	{
		
		BubbleSort_01.bubbleSort(arr); // Here Class Name i.e. BubbleSort_01.Method name i.e. bubbleSort.
		// this is a method call to sort the array. 
		// It will give as sorted array.
		
		int start = 0, 
			end = arr.length-1, 
			mid = (start+end)/2;
		
		while(start <= end)
		{
			if(arr[mid] == search)
			{
				System.out.println("Element found at : " + mid + " index.");
				break;
			}
			else if(search > arr[mid])
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		if(end < start)
		{
			System.out.println("Element not found");
		}
		
	}
}
