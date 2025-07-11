package ToString_01_abstraction;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object e1 = new Employee("Raju", 21343, 50000.0, "Development", 3, "MindTree", 'A');
		System.out.println(e1);
		Employee e2 = new Employee("Raju", 21343, 50000.0, "Development", 3, "MindTree", 'A');
		Employee e3 = new Employee("Raju", 21343, 50000.0, "Development", 3, "MindTree", 'A');
		System.out.println(e2 == e3);
		System.out.println(e1.equals(e3));
		
//		public Boolean equals(Object o)
//		- To compare two object reference we can use equality operator.
//		-  The equality operator compares two object by their references [Original reference] but not their attributes.
//		- equals() method of object class is use to compare two objects by their references which works exactly like equality operator.
//		- equals() method of object class must be override when we have to compare two object by their attributes but no by their reference.
		 
	}

}
