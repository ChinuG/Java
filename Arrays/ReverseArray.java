package Arrays;
// 	Print all the elements in Reverse Order
public class ReverseArray {
	public static void main(String args[])
	{
		int arr[] = {3, 34, 6, 4, 3, 6, 7, 4, 3};
		for(int i=arr.length-1 ; i>=0 ; i--)
		{
			System.out.print(arr[i] + ", ");
		}
	}
}
