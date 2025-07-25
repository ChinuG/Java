package ProtectedModifier;

public class C {
	protected static int a = 10;
	protected double d = 100.12334;
	public C()
	{
		
	}
	protected static void test()
	{
		System.out.println("From protected non-static test of class C");
	}
	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
		System.out.println(a);
		System.out.println(c1.a);
	}
}

//	- Protected Modifier
//	- Protected is a keyword and a modifier
//	- Member prefix with protected modifier is known as protected member.
//	- We can use a protected member anywhere within the same package.
//	- We can use a protected member outside the package only with the help of subclass.
//	- We can make method, variable, or a constructor as a protected.
