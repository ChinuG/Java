package RetrunStatement;

public class ReturnStat {
	public static void add(int a, int b)
	{
		System.out.println(a+b);
		return; //If the return type of method is void using return statement is optional.
	}
	public static void main(String args[])
	{
		int a = 10;
		int b = 20;
		add(a, b);
	}
}
