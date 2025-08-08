//	Sorting Algorithms
//	Bubble Sort
// 	Average case Scenario.
// 	i.e. some of elements are in sorted order. i.e. {78, 56, 10, 20, 39, 48}
package Sorting;
import java.util.Arrays;

public class BubbleSort_01 {
	public static void main(String args[])
	{
//		int arr0[] = {78, 56, 48, 39, 20, 10}; // Try to run all this arrays. every array gives count at last how many times it performs swap.
//		int arr1[] = {6, 5, 4, 3, 2, 1, 0, 1};
		int arr2[] = {78, 56, 10, 20, 39, 48};
//		bubbleSort(arr0);
//		bubbleSort(arr1);
		bubbleSort(arr2);
//		System.out.println(Arrays.toString(arr0));
//		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	public static void bubbleSort(int arr[])
	{
		int i;
		for(i=0 ; i<arr.length-1 ; i++)
		{
			boolean check = false;
			for(int j=0 ; j<arr.length-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					check = true;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(!check)
			{
				break;
			}
		}
		System.out.println(i);// It gives the count of outer loop runs or how many swaps.
//		It gives count of how many times outer loop is traverse or How many times it swaps an element of an array to sort.
	}
}
