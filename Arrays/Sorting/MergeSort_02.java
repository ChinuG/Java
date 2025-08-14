package Sorting;

public class MergeSort_02 {
	public static void main(String args[])
	{
		int arr[] = {6, 3, 9, 5, 2, 8};
		mergeSort(arr, 0, arr.length-1);
		printArr(arr);
	}
	
	public static void printArr(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int arr[], int si, int ei)
	{
		int mid = (si + ei)/2; // si + (ei - si)/2 We can use this formula also. this one is best formula.
		
		mergeSort(arr, 0, mid); // This is first part of array, i.e. 0 to mid
		mergeSort(arr, mid+1, ei); // this is second part of array i.e. mid+1 to end(arr.length-1)
		
		// To merge the array
		merge(arr, si, mid, ei);
	}
	
	public static void merge(int arr[], int si, int mid, int ei)
	{
		
	}
}
