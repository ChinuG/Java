package MethodChaining;

public class Mango {
	String name;
	double price;
	String origin;
	
	Mango()
	{
		
	}
//	Here in all Non-static methods Mango works as return type(Data Type) of method.
	public Mango printName()
	{
		System.out.println(name);
		return this;
	}
	public Mango printPrice()
	{
		System.out.println(price);
		return this;
	}
	public Mango printOrigin()
	{
		System.out.println(origin);
		return this;
	}
//	In this example 
//		- This method will return an object of type Mango.
}
