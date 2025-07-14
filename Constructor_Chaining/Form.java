package Constructor_Chaining;

public class Form {
	String name;
	String location;
	String email;
	long phone;
	String blood;
	double height;
	int wt;
	
	Form()
	{
		
	}
	
	Form(String name, String location, String email, long phone)
	{
		this.name = name;
		this.location = location;
		this.email= email;
		this.phone = phone;	
	}
	
	Form(String name, String location, String email, long phone, String blood)
	{
		this(name, location, email, phone);
		this.blood = blood;
	}
	
	Form(String name, String location, String email, long phone, String blood, double height)
	{
		this(name, location, email, phone, blood);
		this.height = height;
	}
	
	Form(String name, String location, String email, long phone, String blood, double height, int wt)
	{
		this(name, location, email, phone, blood, height);
		this.wt = wt;
	}
	
	public void displayForm()
	{
		System.out.println("Name : " + name);
		System.out.println("Location : " + location);
		System.out.println("Email ID: " + email);
		System.out.println("Phone No : " + phone);
		System.out.println("Blood Group : " + blood);
		System.out.println("Height : " + height);
		System.out.println("Weight : " + wt);
		System.out.println("*******************************************");
		
	}
}
