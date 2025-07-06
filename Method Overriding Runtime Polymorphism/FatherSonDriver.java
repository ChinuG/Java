package Polymorphism;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f1 = new Son(); // UpCasting
		f1.Finance();
		f1.name(); // Overriding name method.
		
//		What is Method Override... ?
//		It is process of giving a new design to super class method from sub class is known as method Overriding.
		
//		NOTE - Method Overriding can be perform with only non-static methods[Static methods cannot be Override].

//			 - In order to to method Overriding the classes must be in Is-A relationship.
//			 - We have to design exact same method with same declaration in subclass with new implementation(body).
//			 - We have to create subclass and UpCast into respective super class type.
//			 
//			 - When we UpCast according to rule of upCasting the binding will be done by considering the type of reference invoke the method by the compiler at the compile time.
//			 - At run time JVM changes the decision by giving priority to the method which belong to type of object created but not to the type use to invoke the method or member.
//		 	 - This is known as method Overriding.
		
//			 *****************---------------OR---------------*****************
	 
//		- If Compile time binding is done by compiler by using parent class method according to UpCasting
//			 - But,
//			 - 		At runtime the JVM changes the decision of compiler by giving priority to the type of object is created instead of prioritized to reference
//			 - that is what compiler decided does not execute.
		 
	}

}
