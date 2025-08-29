package Strings;

public class Strings {
	public static void main(String args[])
	{
		String s1 = "Hi";
		
		String s2 = "Bye";
		
		String s3 = "Hi";
		
		System.out.println(s1 == s3); // It checks reference of an object. It will point to same object reference.
		
		System.out.println(s1.equals(s3)); // it checks value or attribute stores in object i.e. "Hi"
		
		System.out.println(s1.equals(s2)); // 
		
		System.out.println(s1.hashCode()); // HashCode prints reference of an object
		System.out.println(s3.hashCode()); // HashCode prints reference of an object
	}
}

// ******* String *******
//	- String is a group of character.
//	- String is a built in class in Java, if we try to store a string the string value is stored inside an object.
// 	- In Java we can stores String in an object in different ways or by using following classes.

//	1) java.lang.String class
//	2) java.lang.StringBuilder class
//	3) java.lang.StringBuffer class
