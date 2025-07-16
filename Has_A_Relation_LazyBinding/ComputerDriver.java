package Has_A_Relation_LazyBinding;

public class ComputerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Computer("Lenovo", 8, 512, "i3", 33000.0);
		c1.displayComputer();
		c1.insertPendrive("Sandisk", 64, 120, 759.0);
		c1.p.displayPendrive();
		
		Computer c2 = null;
		c2.displayComputer();
	}
}
//	Lazy Instantiation
//		- Lazy Instantiation the instance of the dependent object is not created implicitely using th enon-static initializers and the constructors, instead a method is createdand the reference get created in the main object when the method is called for execution.
//		- this method is known as helper method.