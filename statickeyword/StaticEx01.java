package statickeyword;

public class StaticEx01 {
	
	static int a = 20;
	void print() // Non-Static method.
	{
		System.out.println(a);
	}
	public static void main(String args[])
	{
		int a = 10; // We cannot
		System.out.println(a);
//		print(); // Print is a non-static method, so we cannot access non-static method from static method(main).
	}
}
