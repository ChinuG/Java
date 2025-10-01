package statickeyword;

public class StaticEx01 {
	
	static int a = 20;
	void print01() // Non-Static method.
	{
		print02();
//		static int x = 999; // Static variables are class-level, they cannot be declared inside methods, constructors, or blocks.
		System.out.println(a);
	}
	static void print02()
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		StaticEx01 s = new StaticEx01();
		int a = 10; // We cannot
		System.out.println(a);
		s.print01(); // Print is a non-static method, so we cannot access non-static method from static method(main).
	}
}


//Rules of Static method and non-static methods
//	- Non-static → can call both (static + non-static)
//
//	- Static → can only call static directly
//
//	- To call non-static from static → you must create object.

//	- Static variables → declared only inside class (not inside method).

//	- Local variables (inside methods) → cannot be static.
