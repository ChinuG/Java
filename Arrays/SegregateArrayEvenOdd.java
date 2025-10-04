package Arrays;
import java.util.Arrays;
public class SegregateArrayEvenOdd {
	public static void segregate(int ar[])
	{
		int i = 0, j = ar.length-1;
		while(i<j)
		{
			while(ar[i]%2==0 && i<ar.length-1)
			{
				i++;
			}
			while(ar[j]%2!=0 && j>=0)
			{
				j--;
			}
			if(i<j)
			{
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
		}
	}
	public static void main(String args[])
	{
//		int ar[] = {2, 4, 6, 8};
		int ar[] = {1, 3, 5, 7, 2, 4, 6, 8};
		segregate(ar);
		System.out.println(Arrays.toString(ar));
	}
}
