package DefaultModifier;

public class B extends A{

	public static void main(String[] args) {
		A a1 = new A(); 				// CTE
		System.out.println(A.a1);	// CTE
		a1.test(); 					// CTE
	}

}
