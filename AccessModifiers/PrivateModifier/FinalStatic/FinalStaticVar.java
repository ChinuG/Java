package FinalStatic;

public class FinalStaticVar {

//	static final char CH; // CTE
	static final int A = 100;
	
	static final double PI;
	static
	{
		PI = 22.0/7.0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A);
		System.out.println(PI);
	}
}

// 	Static final Variable
//	- We cannot declare a static final variable without initialization.
//	- It has to be initialize using static initializer(static declare and initialization statement / static block).