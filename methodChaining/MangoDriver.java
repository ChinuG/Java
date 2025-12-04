package methodChaining;

public class MangoDriver {
	public static void main(String args[])
	{
		Mango m = new Mango();
		m.name = "Hapus";
		m.price = 1200.0;
		m.origin = "RatnaGiri";
				
		m.printName().printPrice().printOrigin();
		m.displayMango();
	}
}
