//	Sum of all elements of an Array
package Arrays;

public class SumOFElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
//		int arr[] = {3, 34, 6, 4, 3, 6, 7, 4, 3};
		int arr[] = {0, 1};
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = arr[i] + sum;
		}
		System.out.println(sum);
	}

}
