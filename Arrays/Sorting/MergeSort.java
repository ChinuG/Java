package Sorting;
// Two Pointer Approach. not going to ask in interview but it helps to understand how MergeSort works. 
import java.util.Arrays;

public class MergeSort {
	public static void main(String args[])
	{
		
		int a[] = {3, 8, 16, 2, 53, 98, 117, 250};
		int b[] = {0, 5, 6, 11, 18, 25, 70, 83, 99, 190, 280, 300};
		
		int ans[] = new int[a.length + b.length];
		
		MergeSort(a, b, ans);
		System.out.println(Arrays.toString(ans));
	}
	
	public static void MergeSort(int a[], int b[], int ans[])
	{
		int i=0; 
		int j=0; 
		int k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i] > b[j])
			{
				ans[k] = b[j];
				k++;
				j++;
			}
			else if(a[i] <= b[j])
			{
				ans[k] = a[i];
				k++;
				i++;
			}
		}
		while(i<a.length)
		{
			ans[k++] = a[i++];
		}
		while(j<b.length)
		{
			ans[k++] = b[j++];
		}
		System.out.println(k);
	}
}

