package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30, 40, 50};
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		String names[] = {"Raju", "Kaju", "Moju", "Rani", "Jadu"};
		for(int i=0 ; i<names.length ; i++)
		{
			if(i<names.length-1) // This if condition for last comma(,) i.e. Raju, Kaju, Moju, Rani,
			{
				System.out.print(names[i] + ",");
			}
			else
			{
				System.out.println(names[i]);
			}
		}
		
//		for(int i=0 ; i<names.length ; i++)
//		{
//			if(i<names.length-1)
//			{
//				System.out.print(names[i] + ",");
//			}
//		}

	}

}
