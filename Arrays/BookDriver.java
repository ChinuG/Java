package NewArrays;

public class BookDriver {
	public static void main(String args[])
	{
		Book b1[] = new Book[3];
		b1[0] = new Book("ClassMate", 150.0, 150);
		b1[1] = new Book("Camlin", 130.0, 200);
		b1[2] = new Book("Yuva", 100.0, 100);
		
		for(int i=0 ; i<b1.length ; i++)
		{
			System.out.println(b1[i].toString());
		}
	}
}
