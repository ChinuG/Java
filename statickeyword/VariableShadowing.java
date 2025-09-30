package statickeyword;
// 	Variable Shadowing
// If two variables have the same name ---> one inside a method(local) and one is class (static or instance)
// Then the local one will hide the class one inside that method.
public class VariableShadowing {
	static int x = 10; 				// Class (static) variable.
	public static void main(String args[])
	{
		System.out.println(x);
		int x = 20; 				// Local variable (same name)
		System.out.println(x); 		// Prints 20 (local hides class)
		System.out.println(VariableShadowing.x); // print 10 Class Variable(static variable)
	}
}
