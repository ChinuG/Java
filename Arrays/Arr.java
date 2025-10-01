package Arrays;
import java.util.Arrays;
public class Arr {
	public static void main(String args[])
	{
		int arr[] = {1, 2, 3, 4, 5};
		
//		System.out.println(Arrays.toString(arr));
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
