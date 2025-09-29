package statickeyword;

public class mainMethod {
	// Created two methods with the same (i.e. main(int a, int b)) name but different method (i.e. String args[]). 
	public static void main(int a, int b) // It is a static method overloading method. Not the JVM entry point.
	{
		System.out.println(a+b);
	}
	public static void main(String args[]) // This line is JVM entry point 
	{
		// JVM will only call main(String args[]) automatically.
		int a = 10;
		int b = 20;
		main(a, b);
	}
}
