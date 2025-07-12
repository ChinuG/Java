package thiskeyword;

public class Car {
	String  brand= "Maruti";
	String name = "Omni";
	double price = 300000.0;
	
	public void displayCar()
	{
		String name = "kidnap Car";
		System.out.println("Brand : " + brand);
		
		System.out.println("Name : " + name);
		System.out.println("Name : " + this.name);
		System.out.println(this);
		System.out.println("Price : " + price);
	}
}
