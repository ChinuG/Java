package NonStatic_Ex_01;

public class Book {
	String brand;
	double price;
	int pages;
	String type;
	String bind;
	String size;
	int gsm;

	public void displayBook()
	{
		System.out.println(" : " + brand);
		System.out.println(" : " + price);
		System.out.println(" : " + pages);
		System.out.println(" : " + type);
		System.out.println(" : " + bind);
		System.out.println(" : " + size);
		System.out.println(" : " + gsm);
	}
}

