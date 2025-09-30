package statickeyword;
// Static variable are assign with default values during the loading process, therefore we can use static variable without initialization.

public class Stat {
	public static void test()
	{
		System.out.println(pi);
	}
	static float pi ;
	public static void main(String args[])
	{
		System.out.println(pi);
		test();
	}
}

