package Arrays;

public class ArrayBook {
	String brand;
	double price;
	int pages;
	
	public ArrayBook()
	{
		
	}
	
	public ArrayBook(String brand, double price, int pages)
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
				", Pages : " + pages + "]";
	}
	
	public void displayArrayBook()
	{
		System.out.println("brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Pages : " + pages);
		System.out.println("------------------------------");
	}
	
}
