package Has_A_Relation;

public class Mobile {
	String brand;
	String name;
	String color;
	double price;
	int ram;
	int rom;
	
	Mobile()
	{
		
	}
	Mobile(String brand, String name, String color, double price, int ram, int rom)
	{
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}
	Battery b1 = new Battery();
	
	public void displayMobile(int n)
	{
		System.out.println("************Mobile " + n + "************");
		System.out.println("Brand : " + brand);
		System.out.println("Name : " + name);
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
		System.out.println("RAM : " + ram);
		System.out.println("ROM : " + rom);
		System.out.println("*************************************");
	}
}
