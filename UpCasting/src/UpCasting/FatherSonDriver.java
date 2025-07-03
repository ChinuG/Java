package UpCasting;

public class FatherSonDriver {
	public static void main(String args[])
	{
		Son s1 = new Son();
		s1.drinking();
		s1.smoking();
		
		Father f1 = new Son();
		f1.drinking();
//		f1.smoking(); // Compile time error
//		The compiler checks the type of reference not the type of object creation.
//		And why is not check type of object because object is created at runtime.
	}
}
