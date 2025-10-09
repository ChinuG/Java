package NewArrays;

public class Book {
	String brand;
	double price;
	int pages;
	
	public Book()
	{
		
	}
	public Book(String brand, double price, int pages)
	{
		super();
		this.brand = brand;
		this.price = price;
		this.pages = pages;
	}
	public String toString()
	{
		return "[Brand : " + brand +
				", Price : " + price + 
				", Pages : " + pages + " ]";
	}
	public void displayBook()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(pages);
		System.out.println("---------------");		
	}
}
