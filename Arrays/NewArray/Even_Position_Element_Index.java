package NewArrays;
// Write a program to print all even position (index) of an given Array
public class Even_Position_Element_Index 
{
	public static void evenPosition(int ar[])
	{
		for(int i=0 ; i<ar.length; i++)
		{
			if(ar[i]%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		int ar[] = {3, 34, 6, 4, 3, 7, 6, 4, 2, 3};
		evenPosition(ar);
	}
}
