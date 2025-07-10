package Practice;

public class BA extends AB{
	public void displayA(String str)
	{
		System.out.println("From A class");
	}
	public void add(int n1, int n2)
	{
		int res = n1 + n2;
		System.out.println(res);
	}
	
	public void sub(int a, int b)
	{
		int res = a - b;
		System.out.println(res);
	}
}
