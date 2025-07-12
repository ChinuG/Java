package MethodChaining;

public class PenDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1 = new Pen();
		p1.openCap().write().closeCap();
	}
}
//	Method Chaining
//	new Pen()
//		👇
//	.openCap()
//		👇
//	.write()
//		👇
//	.closeCap()

//		- Each method returns this(the same Pen Object),
//			so the next method can be called on the same object.
	
//		- Doing multiple action on same Pen -> step by step -> in one smooth line.
	
	