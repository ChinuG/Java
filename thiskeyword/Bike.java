package thiskeyword;

public class Bike {
	String name = "Duke";
	String type = "Chapri Bike";
	double price = 150000.0;
	
	public void displayBike()
	{
		String type = "Racing Bike";
		System.out.println("Name : " + name);
		System.out.println("Type : " + type);
		System.out.println("Type : " + this.type);
		System.out.println("Price : " + price);
		System.out.println(this); 
	}
}
