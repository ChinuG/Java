package Java_Practice;

public class MultipleClasses 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		First.main();
		Second.main();
		Third.main();
	}
}
class First
{
	public static void main()
	{
		System.out.println("From First class");
	}
}
class Second
{
	public static void main()
	{
		System.out.println("From Second class");
	}
}
class Third
{
	public static void main()
	{
		System.out.println("From Third class");
	}
}
