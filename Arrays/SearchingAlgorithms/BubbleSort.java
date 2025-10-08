//	Sorting Algorithms
//	Bubble Sort
// 	Worst case Scenario Smallest element is at last index.
package SearchingAlgorithms;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[])
	{
		int arr[] = {78, 56, 48, 39, 20, 10};
//		int arr[] = {6,5,4,3,2,1,0,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
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
	}
}
