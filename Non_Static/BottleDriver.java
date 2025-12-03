package NonStatic_Ex_01;

public class BottleDriver {
	public static void main(String args[])
	{
		Bottle b1 = new Bottle();
		b1.displayBottle();
		System.out.println("******************");
		
		Bottle b2 = new Bottle();
		b2.displayBottle();
		System.out.println("******************");
	}
}
