package constructor_Overloading;

public class StudentDriver 
{
	public static void main(String args[])
	{
		Student s = new Student("Suresh", 9, 47, 23);
		s.displayName();
		s.displayStandard();
	}
}
