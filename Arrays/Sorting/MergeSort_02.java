package Sorting;

public class MergeSort_02 {
	
	public static void printArr(int arr[])
	{
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void merge(int arr[], int si, int mid, int ei)
	{
		// left(0 to 3)=4 and right(4 to 6)=3, So 
		int temp[] = new int[ei-si+1]; // So 6-0+1 = 7, So size temp array is 7
//		int temp[] = new int[arr.length];
		int i = si; // For left part array
		int j = mid+1; // For right part of an array
		int k = 0; // Iterator for temp array.
		
		while(i <= mid && j <= ei)
		{
			if(arr[i] < arr[j])
			{
				temp[k] = arr[i];
				i++;
			}
			else 
			{
				temp[k] = arr[j];
				j++;
			} 
			k++;
		}
		
		// If one array length is larger than another then remaining elements need to copy in temp array So,
		// For left part of an array.
		while(i <= mid)
		{
			temp[k++] = arr[i++];
		}
		// For left part of an array.
		while(j <= ei)
		{
			temp[k++] = arr[j++];
		}
		
		// Copy temp array in original array
		for(k=0, i=si ; k<temp.length ; k++, i++)
		{
			arr[i] = temp[k];
		}
	}
	
	public static void mergeSort(int arr[], int si, int ei)
	{
		if(si>=ei)
		{
			return;
		}
//		int mid = (si + ei)/2; // si + (ei - si)/2 We can use this formula also. this one is best formula.
		int mid = si + (ei - si)/2; 
		mergeSort(arr, si, mid); // This is first part of array, i.e. 0 to mid
		mergeSort(arr, mid+1, ei); // this is second part of array i.e. mid+1 to end(arr.length-1)
		
		// To merge the array
		merge(arr, si, mid, ei);
	}
	
	
	public static void main(String args[])
	{
		int arr[] = {6, 3, 9, 5, 2, 8};
		mergeSort(arr, 0, arr.length-1);
		printArr(arr);
	}
}
