package NonStatic_Ex_01;

public class BottleDriver {
	public static void main(String args[])
	{
		Bottle b1 = new Bottle();
		System.out.println("******************");
		
		b1.color = "Black";
		b1.cap = 2.5;
		
		b1.displayBottle(b1.color, b1.cap);
	}
}
