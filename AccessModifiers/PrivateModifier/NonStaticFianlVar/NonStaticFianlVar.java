package NonStaticFianlVar;

public class NonStaticFianlVar {
//	final byte b; // Compile Time Error
	final int a;
	final char ch = 'a';
	final double sal;
	
	{
		sal = 50000.05;
	}

	public NonStaticFianlVar()
	{
		a = 100;
	}
	public static void main(String[] args) {
//		final byte b;
//		final int a; 
//		final char ch = 'a';
//		final double sal;
//		
//		{
//			sal = 50000.05;
//		}
	
	}
}

//	Non-Static final variable
//	- A Non-static final variable cannot be declare without initialization.
//	- A Non-static final variable must be initialize with the help of non-static initializer or constructors.