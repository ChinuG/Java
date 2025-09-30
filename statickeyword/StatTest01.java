package statickeyword;

public class StatTest01 {
	static int i;
	static double d = 1.1;
	public static void demo()
	{
		System.out.println(i);
		i = -1;
		System.out.println(i);
	}
	public static void main(String args[])
	{
		System.out.println(i);
		i = 100;
		System.out.println(i);
		demo();
		
	}
}
