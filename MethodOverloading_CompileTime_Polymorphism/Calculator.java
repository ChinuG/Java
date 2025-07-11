package MethodOverloading;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(10.0, 7.0));
		System.out.println(divide('a', 7.0));
		System.out.println(divide('a', 7));
	}
	
	public static int add(int a, int b)
	{
		return a+b;
	}
	
	public static double add(double a, double b)
	{
		return a+b;
	}
	
	public static int divide(int num, int den)
	{
		return num/den;
	}
	public static double divide(double num, double den)
	{
		return num/den;
	}
	
//	Method Overloading
//		-  If a class has more than one method of same name with different formal arguments is known as method Overloading.

//		Rules 
//			1) The name of method must be same.
//			2) The formal argument must differ either in it's length or it must differ in it's data type.
	
//		Purpose :- 
//			- We do method Overloading when the operation to be performed is same but the values are different either in it's type or numbers.

//		NOTE - 
//			 - Method Overloading is comes under Compile time polymorphism (Compile time binding)
//			 - Here the binding between the method call statement and method body is done by compiler at compile time.
//			 - Refer method binding process.
		
}
