package parameterizedConstructor;

public class ShoeDriver
{
	public static void main(String args[])
	{
		Shoe s = new Shoe();
		s.displayShoe();
		
		Shoe s1 = new Shoe("Nike", 5000.0, 10, "Sport", "White");
		s1.displayShoe();

		Shoe s2 = new Shoe("Adidas", 6000.0, 11, "Sport", "Black");
		s2.displayShoe();
	}
}
