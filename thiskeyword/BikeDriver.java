package thiskeyword;

public class BikeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		System.out.println(b1);
		
		b1.displayBike();
		
		
//		This keyword
		
//		- This is a keyword and non-static reference variable.
//		- Which will have the reference of an object which is currently under use.
		
//		Purpose -
//				- It is use to refer the object members(Non-static members) in the non-static context
//				- This means "this object", and is used to access its own members.
		
//			- If we have local variable and global non-static variable of same name,
//			  We use this keyword in order to refer the non-static global variable instead of local variable.
	}

}
