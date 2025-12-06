package constructor_Overloading;

public class Student
{
	String name;
	int standard;
	int rollNo;
	int age;
	
	Student()
	{
		System.out.println("From Default Constructor");
	}
	
	Student(String name, int standard)
	{
		this.name = name;
		this.standard = standard;
	}
	
	Student(String name, int standard, int rollNo, int age)
	{
		this(name, standard);
		this.rollNo = rollNo;
		this.age = age;
		System.out.println(rollNo);
		System.out.println(age);
	}
	
	public void displayName()
	{
		System.out.println(name);
	}
	
	public void displayStandard()
	{
		System.out.println(standard);
	}
}
