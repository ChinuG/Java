package constructor;

public class Constructor 
{

	String conName;

	public Constructor()
	{
		System.out.println("This is form Constructor 1");
	}
	
	Constructor(String name, int rollNo, int age)
	{
		this(name, rollNo);
		this.conName = name;
		System.out.println(conName + " Constructor");
		System.out.println(age + " Constructor");
	}
	
	Constructor(String name, int rollNo)
	{
		this();
		System.out.println(name);
		System.out.println(rollNo);
		
	}
}

