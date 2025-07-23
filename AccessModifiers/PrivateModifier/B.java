package PrivateModifier;

public class B {

	public static void main(String[] args) {
		System.out.println(A.a); 
		// Not accessible because variable a is private in class A, and also private member is not accessible in another class
		
		A a1 = new A();
		a1.test();
		
//		- Private is a keyword and a modifier.
//		- Any member which are prefix with private modifier is called private member.
//		- We can make a variable, method, constructor as private.
//		- If a member is made private is cannot be access outside a class.
//		- We cannot access private member(variable, method, and constructor) in different class or sub classes of the same package.
//		- Private member cannot be used outside the package.

	}

}
