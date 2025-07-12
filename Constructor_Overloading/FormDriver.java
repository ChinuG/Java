package Constructor_Overloading;

public class FormDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form f1 = new Form();
		f1.displayForm();
		
		Form f2 = new Form("Bheem", 23, 1234567890l, "Dholakpur", "AtoZ", 1234567890l, "Pune");
		f2.displayForm();
		
		Form f3 = new Form("Bheem", 23, 1234567890l, "Dholakpur", "AtoZ", 1234567890l);
		f3.displayForm();
		
		Form f4 = new Form("Bheem", 23, 1234567890l, "Dholakpur", "AtoZ");
		f4.displayForm();
		
//		Constructor Overloading
//			- A class having more than one constructor is known as constructor overloading.

//		Rules - 
//				1) The name of constructor must be same.
//				2) The formal arguments of the constructor must change either in it's type or length.
//				3) Constructor Overloading comes under Compile time Polymorphism (Compile Time Binding)
//					Here, 
//							The Compiler will decide which constructor has to be executed at compile time 
//							(the binding is done by the compiler)
		
//		Purpose - We do or perform Constructor Overloading when we want to customized 
//					the loading of the values to the object members.
	}

}
