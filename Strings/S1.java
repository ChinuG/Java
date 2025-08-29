package Strings;

public class S1 {
	public static void main(String args[])
	{
		String s1 = new String("Hi");
		System.out.println(s1);
		
		String s2 = new String("Hi");
		System.out.println(s1 == s2); // It checks reference of an object. 
		// Here objects are different and == checks reference so it gives false.
		
		System.out.println(s1.equals(s2)); // It checks what value stored in object 
		// it checks values or attributes stored in object. 
		// So here values are same i.e. Hi. 
		// So it give true.
		System.out.println(s1.hashCode()); 
		System.out.println(s2.hashCode());
	}
}
