package Two_D_Arrays;
// Sum of sub array in 2 dimensional array.
public class SumOfSubArray_2DArray {
	public static void main(String args[])
	{
		int a[][] = {{9, 8, 7},
				     {6, 5, 4},
				     {3, 2, 1}};
		
		
		for(int i=0 ; i<a.length ; i++)
		{
			int sum = 0;
			for(int j=0 ; j<a[i].length ; j++)
			{
				sum += a[i][j];
			}
			System.out.println(sum);
		}
	}
}
