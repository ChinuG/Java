package PrivateModifier;

public class A {
	private static int a = 10;
	private A()// Private Constructor
	{
		
	}
	private static void test()
	{
		System.out.println("From private method of class A");
	}
}
