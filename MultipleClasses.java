package java;

public class MultipleClasses 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
class First
{
	static
	{
		System.out.println("From First class");
	}
}
class Second
{
	static
	{
		System.out.println("From Second class");
	}
}
class Third
{
	static 
	{
		System.out.println("From Third class");
	}
}