package DefaultModifier;

public class A {
	static int a = 123;
	void test()
	{
		System.out.println("From default non-static test of A");
	}
	A()
	{
		
	}
	public static void main(String args[])
	{
		A a1 = new A();
		System.out.println(a1);
		a1.test();
	}
}

//	- If a member is not prefix with any access modifier then it is called as Default Modifier.
//	- The visibility of default members is only in same package.
//	- We can make class, variable, method and a constructor as default.
//	- Default member can use anywhere in the same package(any class or subclass of same package).
//	- When a class made default it cannot be imported in the classes present in different packages.
//	- We cannot use the default members of parent class in sub class when the parent class or child class is in different package.
