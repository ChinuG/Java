package Constructor_Overloading;

public class Form {
	String name;
	int age;
	long phone;
	String email;
	String location;
	String blood;
	long tel;
	String tempLoc;
	
	Form()
	{
		
	}
	
	Form(String name, int age, long phone, String location)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.location = location;
	}
	
	Form(String name, int age, long phone, String location, String blood)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.location = location;
		this.blood = blood;
	}
	
	Form(String name, int age, long phone, String location, String blood, long tel)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.location = location;
		this.blood = blood;
		this.tel = tel;
	}
	
	
	Form(String name, int age, long phone, String location,
			String blood, long tel, String tempLoc)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.location = location;
		this.blood = blood;
		this.tel = tel;
		this.tempLoc = tempLoc;
	}
	
	public void displayForm()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phone No : " + phone);
		System.out.println("Location : " + location);
		System.out.println("Blood Group : " + blood);
		System.out.println("Telephone : " + tel);
		System.out.println("Temperory Location : " + tempLoc);
		System.out.println("*********************************************");
	}
}
