package NonPrimitiveTypeCasting;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 = new Son();
		s1.drinking();
		s1.smoking();
		
		Father f1 = new Son();
		f1.drinking();
//		f1.smoking();
//      Compile Time Error because compiler checks the type of reference
//		not the type of object creation. -->
	}

}
