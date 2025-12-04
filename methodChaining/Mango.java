package methodChaining;

// 	The process of calling methods continuously one after another is called Method Chaining.
//	NOTE - We can achieve this process only if method returns the reference for another method to execute.

public class Mango {
	String name;
	double price;
	String origin;

	public Mango printName() {
		System.out.println(name);
		return this;
	}

	public Mango printPrice() {
		System.out.println(price);
		return this;
	}

	public Mango printOrigin() {
		System.out.println(origin);
		return this;
	}
	
	public void displayMango()
	{
		
	}
}
