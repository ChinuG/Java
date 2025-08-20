package patterns;

public class HollowSquare {
	public static void main(String args[])
	{
		int n = 4;
//		int arr[][] = {{1, 2, 3}, 
//				   	   {7, 8, 9}, 
//				   	   {4,5,6}};
		for(int i=0 ; i<n ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				if(i==0 || i==n-1 || j==0 || j==n-1)
				{
					System.out.print("*" + " ");
				}
//				else
//				{
//					System.out.println();
//				}
			}
			System.out.println();
		}
	}
}
