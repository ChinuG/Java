package Arrays;

public class ArrayBookDriver {
	public static void main(String args[])
	{
		ArrayBook b1[] = new ArrayBook[3];
		b1[0] = new ArrayBook("ClassMate", 175.5, 300);
		b1[1] = new ArrayBook("Camlin", 150.0, 200);
		b1[2] = new ArrayBook("Yuva", 125.0, 190);
		
		for(int i=0 ; i<b1.length ; i++)
		{
			System.out.println(b1[i].toString());
		}
		
		System.out.println(b1); // Print Address of Object of Array b1[].
	}
}
