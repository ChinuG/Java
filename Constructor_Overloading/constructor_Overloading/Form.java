package constructor_Overloading;

public class Form
{
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
	
	Form(String name, int age, long phone, String email, String loc)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.location = loc;
	}
	Form(String name, int age, long phone, String email, String loc, String blood)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.location = loc;
		this.blood = blood;
	}
	
	Form(String name, int age, long phone, String email, String loc, String blood, long tel)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.location = loc;
		this.blood = blood;
		this.tel = tel;
	}
	
	Form(String name, int age, long phone, String email, String loc, String blood, long tel, String tempLoc)
	{
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.location = loc;
		this.blood = blood;
		this.tel = tel;
		this.tempLoc = tempLoc;
	}
	
	public void displayForm()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Phone : " + phone);
		System.out.println("Email : " + email);
		System.out.println("Location : " + location);
		System.out.println("Blood : " + blood);
		System.out.println("Telephone : " + tel);
		System.out.println("Temp Location : " + tempLoc);
		System.out.println("********************************");
	}
	
}

