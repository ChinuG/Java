package Two_D_Arrays;
//	Sum of all elements in 2d arrays
public class SumOfAllElements_2DArray{
	public static void main(String[] args) {
		int arr[][] = {{1, 2, 3}, 
					   {7, 8, 9}, 
					   {4, 5, 6}};
		int sum = 0;
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=0 ; j<arr[i].length ; j++)
			{
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}