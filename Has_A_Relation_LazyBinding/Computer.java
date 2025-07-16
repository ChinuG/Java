package Has_A_Relation_LazyBinding;

public class Computer {
	String brand;
	int ram;
	int rom;
	String processor;
	double price;
	
	Pendrive p;
	
	public Computer()
	{
		
	}
	public Computer(String brand, int ram, int rom, String processor, double price)
	{
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.price = price;
	}
	
//	Helper Method
	public void insertPendrive(String brand, int memory, int speed, double price)
	{
		p = new Pendrive(brand, memory, speed, price);
		System.out.println("Pendrive Inserted");
	}
	
	public void displayComputer()
	{
		System.out.println("Brand : " + brand);
		System.out.println("RAM : " + ram);
		System.out.println("ROM : " + rom);
		System.out.println("Processor : " + processor);
		System.out.println("Price : " + price);
		System.out.println("*************************************");
	}
}
