package statickeyword;

public class StaticKeyDriver {
	public static void main(String args[])
	{
		float rad = 50.0f; 
		float circle = StaticKey.pi * (rad * rad); // This pi variable is accessed from different class using reference as class name.
		
		System.out.println(circle);
	}
	
}
