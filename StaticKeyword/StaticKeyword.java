package StaticKeyword;

public class StaticKeyword {
	int a = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword s1 = new StaticKeyword();
		System.out.println(s1.a);
		System.out.println(s1.a);
		
		A a1 = new A();
		A.show();
		
		A a2 = new B();
		a1.show();
		
//		Static Keyword
//		 - Static is a Keyword and a modifier
//		 - Any member which are prefix with static modifier are known as static members.
//		 - We can prefix static access modifier to a method , variable and a block.

//		NOTE - 
//			 -  Static members are called as class members.
//			 - For a static member the memory is allocated in class static area.
//			 - Static member of a class can be used in any members of the same class,
//			   and also can be used in any members which belong to different class with the help of class name as reference.
//		IMP	 - We can use static members without creating any object for a class.
		
//		Static Method.
//			 - The methods which are prefix with static modifier are known as static methods.
		
		
//		How to Call static method from one class to another class.

//		NOTE 
//			 - Method body will be store in the method area
//			 - Method signature and its reference is stored in class static area.
//			 - As static method of a class can be sue within the same class directly with its name.
//			 - and call that method [using class name] in another class using class name.
//			 - The block which is associated with a static method is known as static context.
	}

}
