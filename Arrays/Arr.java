package Arrays;
import java.util.Arrays;
public class Arr {
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 4, 5};
		// Printing array using inbuilt method Arrays.toString()
		System.out.println(Arrays.toString(arr));

		// Printing array using for loop manually
		
		int i = 0;
		System.out.print("[ ");
		for(; i<arr.length-1 ; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		if(arr[i] <= arr.length)
		System.out.println(arr[i] + " ]");
	}
}

