package statickeyword;

public class StaticBlock02 {
	static int a;
	static
	{
		System.out.println(a);
		System.out.println("From static block");
	}
	public static void main(String args[])
	{
		System.out.println("Hello World!");
		test();
	}
	public static void test()
	{
		System.out.println("From test()");
	}
}
