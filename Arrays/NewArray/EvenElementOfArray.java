package NewArrays;
// Print even number of element of the array.
public class EvenElementOfArray {
	public static void printEven(int ar[])
	{
		for(int i=0 ; i<ar.length ; i++)
		{
			if(ar[i] % 2 == 0)
			{				
				System.out.println(ar[i]);
			}
		}
	}
	public static void main(String args[])
	{
		int ar[] = {1,2,3,4,5,6,7,8,9,10};
		printEven(ar);
	}
}
