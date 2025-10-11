package NewArrays;
// Write a program to print sum of all elements of an Array.
public class Sum_Of_All_Elements_03 
{
	public static void sumOfElements(int ar[])
	{
		int sum = 0;
		for(int i=0 ; i<ar.length ; i++)
		{
			sum += ar[i]; // This line of code works fast as compair to given below
			// Or use sum = sum + ar[i];
		}
		System.out.println(sum);
	}
	public static void main(String gargs[]) 
	{
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		sumOfElements(ar);
	}
}

