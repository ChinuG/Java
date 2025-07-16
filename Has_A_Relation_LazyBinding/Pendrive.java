package Has_A_Relation_LazyBinding;

public class Pendrive {
	String brand;
	int memory;
	int speed;
	double price;
	
	public Pendrive()
	{
		
	}
	
	public Pendrive(String brand, int memory, int speed, double price)
	{
		this.brand = brand;
		this.memory = memory;
		this.speed = speed;
		this.price = price;
	}
	
	public void displayPendrive()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Memory : " + memory);
		System.out.println("Speed : " + speed);
		System.out.println("Price: " + price);
		System.out.println("*************************************");
	}
}
