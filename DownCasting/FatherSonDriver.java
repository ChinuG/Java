package DownCasting;

public class FatherSonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		This is UpCasting 👇 Converting or storing the sub class reference into super class type is known as UpCasting
//		Son s1 = new Son();
//		Father f1 = new Son();
//		
//		f1.drinking();
//		f1.smoking();
		
//		DownCasting 👇 
//		It is a process of Converting or storing the UpCasted reference into it's respective subclass type is known as DownCasting
		Father s1 = new Son(); // 1st UpCasting
		Son s2 = (Son)s1; // 2nd then DownCasting
		s2.drinking();
		s2.smoking();
	}

}
