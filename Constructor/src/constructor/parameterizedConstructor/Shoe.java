package parameterizedConstructor;

public class Shoe 
{
	String brand;
	double price;
	int size;
	String type;
	String color;
	
	Shoe()
	{
		
	}
	
	Shoe(String brand, double price, int size, String type, String color)
	{
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.type = type;
		this.color = color;
		System.out.println("Values are Loaded!");
	}
	
	public void displayShoe()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Size : " + size);
		System.out.println("Type : " + type);
		System.out.println("Color : " + color);
		System.out.println("*********************************");
	}
}
