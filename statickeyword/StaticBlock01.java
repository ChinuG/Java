package statickeyword;
//	- When does the static block executes ?
//--->	- During the loading process of an class.
//		- A class can have any number of static blocks which gets executed in top to bottom order.
//	- Why we need static block ?
//--->	- To executes statement before main method.
public class StaticBlock01 {
	static
	{
		System.out.println("From static block 1");
	}
	static
	{		
		System.out.println("From static block 2");
	}
	static
	{
		System.out.println("From static block 3");		
	}
	public static void main(String args[])
	{
		System.out.println("Hello World!");
	}
	static
	{
		System.out.println("From static block 4");
	}
}
