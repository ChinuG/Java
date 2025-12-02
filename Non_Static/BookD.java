package NonStatic_Ex_01;

public class BookD {
	public static void main(String args[])
	{
		
		System.out.println("For Book 1 With initializing values");
		Book b1 = new Book();
		b1.brand = "Classmate";
		b1.price = 250.0;
		b1.size = "Long Note";
		b1.bind = "Hard Bound";
		b1.pages = 400;
		b1.type = "Ruled";
		b1.gsm = 70;
		System.out.println("Brand is : "+ b1.brand);
		System.out.println("Price is : "+ b1.price);
		System.out.println("Size is : "+ b1.size);
		System.out.println("Bind is : "+ b1.bind);
		System.out.println("Pages is : "+ b1.pages);
		System.out.println("Type is : "+ b1.type);
		System.out.println("GSM is : "+ b1.gsm);
		System.out.println("*****************************");
		
		System.out.println("For Book 2 With initializing values");
		Book b2 = new Book();
		b2.brand = "Camline";
		b2.price = 230.0;
		b2.size = "Long Note";
		b2.bind = "Hard Bound";
		b2.pages = 355;
		b2.type = "Ruled";
		b2.gsm = 70;
		System.out.println("Price is : "+ b2.price);
		System.out.println("Brand is : "+ b2.brand);
		System.out.println("Size is : "+ b2.size);
		System.out.println("Bind is : "+ b2.bind);
		System.out.println("Pages is : "+ b2.pages);
		System.out.println("Type is : "+ b2.type);
		System.out.println("GSM is : "+ b2.gsm);
		System.out.println("*****************************");
		
		System.out.println("For Book 3 Without initializing values");
		Book b3 = new Book();
//		b2.brand = "Camline";
//		b2.price = 230.0;
//		b2.size = "Long Note";
//		b2.bind = "Hard Bound";
//		b2.pages = 355;
//		b2.type = "Ruled";
//		b2.gsm = 70;
		System.out.println("Price is : "+ b3.price);
		System.out.println("Brand is : "+ b3.brand);
		System.out.println("Size is : "+ b3.size);
		System.out.println("Bind is : "+ b3.bind);
		System.out.println("Pages is : "+ b3.pages);
		System.out.println("Type is : "+ b3.type);
		System.out.println("GSM is : "+ b3.gsm);
		System.out.println("*****************************");
		
	}
}
