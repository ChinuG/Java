package Arrays;

import java.util.Arrays;
public class firstArray
{
	public static void printArray(int ar[]) // Method to print array.
	{
		int i;
		System.out.print("[");
		for(i=0 ; i<ar.length-1 ; i++)
		{
			System.out.print(ar[i] + ", ");
		}
		System.out.print(ar[i] + "]");
	}
	public static void main(String args[])
	{
		int ar[] = new int[5];// Created an Array of index size 5.
		ar[0] = 10; // Assigning values to particular index.
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 60;
//		ar[5] = 90; // ArrayIndexOutOfBoundsException
//		ae[-1] = 100; // ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(ar)); // Printing an array using inbuilt method
//		OR
		printArray(ar); // calling a method 
	}
}
