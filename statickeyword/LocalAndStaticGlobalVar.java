package statickeyword;
// We can have local variable and static variable of same name.
//	- In this case if only variable name is used the preference is given to the local variable.
//	- To refer the global variable when we have the local variable of same name.
//	- We have to use class name as reference.

//In Short
//	- Local and static variable can have same name.
//	- Local variable gets priority inside the method(Variable shadowing).
//	- What is Variable shadowing :- Variable Shadowing happens when a local variable (inside a method or block)has the same name as
//		a class-level variable(static or instance).
//	- To access static variable, use ClassName as reference.
public class LocalAndStaticGlobalVar {
	static int a = 100;
	public static void demo()
	{
		System.out.println("3 : " + a);
		a = 10;
		System.out.println("4 : " + a); // Variable shadowing because local and static variable has same variable name.
		// And this local a variable hides static variable in his scope(i.e. demo() method block)
		char a = 'a';
		System.out.println("5 : " + a);
		System.out.println("6 : " + LocalAndStaticGlobalVar.a);
	}
	public static void main(String args[])
	{
		System.out.println("1 : " + a);
		String a = "ABC";
		System.out.println("2 : " + a);
		demo();
		System.out.println("7 : " + LocalAndStaticGlobalVar.a);
	}
}

