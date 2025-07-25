package ProtectedModifier;

public class D {
	public static void main(String args[])
	{
		C c1 = new C();
		c1.test();
		System.out.println(c1.d);
		System.out.println(c1.a);
	}
}
