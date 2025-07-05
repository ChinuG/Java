package ReturnStatiement;

class A
{
	public static void method1()
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		return;
		System.out.println(a);
	}
}

public class ReturnSta {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.method1();
		
		
//		Return Statement
//		- Return is a keyword and it is an control transfer statement.
//		- Return statement will stop the execution of method, frame will destroy and control is transfered to the calling method along with value.
//		
//		Note - If the return type of method is void then return statement is optional.
//		
//		- If return type of method is anything other that void
//			- it means method wants to return some value to the calling method.
//			- it is mandatory to use return statement.
//			- return statement must have value or expression to be return back to the calling method.
//		- Return statement can do widening.
//		- A value return by a method can be stored inside a variable or used directly in an expression or do nothing.
//		- Return statement must be the last statement into the method body.

//		IMP - If you put any statement after return, we get Unresolved compilation problem: Unreachable code or unreachable statement Compile time error.
		
	}

}
