package MethodChaining;

public class MangoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mango m1 = new Mango();
		
		m1.name = "Hapus";
		m1.origin = "Ratnagari";
		m1.price = 1200;
		
		m1.printName().printOrigin().printPrice();
		
//		Method Chaining
//			- The process of calling the method continuously,
//				one after other is called Method Chaining.
//			- Only if method return the reference for the another method to execute.
		
//		Syntax :- ref.m1().m2().m3()...
		
	}
}
