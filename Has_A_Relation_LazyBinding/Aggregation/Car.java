//	************** Dependent Class **************
package Aggregation;

public class Car {
	String brand;
	String model;
	double price;
	String color;
	int cc;
	String type;
	// Step 2
	Engin e;
	Car()
	{
		
	}
	
	public Car(String brand, String model, double price, String color, int cc, String type, Engin e)
	{
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		this.cc = cc;
		this.type = type;
		this.e = e;
	}
	
	public String printCar()
	{
		return "Brand : " + brand + " Model : " + model + " Price : " + price + " Color : " + color + " CC : " + cc + " Type : " + type;
	}
}
