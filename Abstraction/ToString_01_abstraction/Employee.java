package ToString_01_abstraction;

public class Employee {
	String name;
	int empId;
	double sal;
	String dept;
	int exp;
	String company;
	char grade;
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int empId, double sal, String dept, int exp,
			String company, char grade)
	{
		this.name = name;
		this.empId = empId;
		this.sal = sal;
		this.dept = dept;
		this.exp = exp;
		this.company = company;
		this.grade = grade;
	}
	
	public String toString()
	{
		return "[Name : " + name + 
				", Employee ID : " + empId + 
				", Salary : " + sal + 
				", Dept : " + dept + 
				", Exp : " + exp +
				", Company : " + company +
				", Grade : " + grade + "]";
	}
}
