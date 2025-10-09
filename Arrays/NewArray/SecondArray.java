package Arrays;

public class SecondArray {
	public static void main(String args[])
	{
		int ar[] = {10, 20, 30, 40, 50}; // Created int type array and gives values
		for(int i=0 ; i<ar.length ; i++)
		{
			System.out.println(ar[i]);
		}
		
		String names[] = {"Sammed", "Shubham", "Chinmay"}; // // Created String type array and gives values
		for(int i=0 ; i<names.length ; i++)
		{
			if(i<names.length-1)
			{
				System.out.print(names[i] + ", ");							
			}
			else
			{
				System.out.println(names[i]);
			}
		}
	}
}
