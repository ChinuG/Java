package NewArrays;
// Write a program to copy array into duplicate array.

public class Copy_Array_Into_Duplicate_Array 
{
	public static void copyArray(int ar[])
	{
		int copyAr[] = new int [ar.length];
	
		for(int i=0 ; i<ar.length ; i++)
		{
			copyAr[i] = ar[i];
			System.out.print(copyAr[i] + " ");
		}
	}
	public static void main(String args[])
	{
		int ar[] = {3, 34, 6, 4, 3, 6, 7, 4, 3};
		copyArray(ar);
	}
}

