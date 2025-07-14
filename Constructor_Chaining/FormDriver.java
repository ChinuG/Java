package Constructor_Chaining;

//import Constructor_Overloading.Form;

public class FormDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form f2 = new Form("Raju", "Dholakpur", "raju@1234gmail.com", 1234567890l, "AtoZ", 5.7, 70);
		f2.displayForm();
		
		Form f1 = new Form("Rani", "Pehelwanpur", "rani@9999gmail.com", 9876543210l, "ZtoA", 5.2, 50);
		f1.displayForm();
	}
}

//	Constructor Chaining 
//	Define - One Constructor calling another constructor for execution is called Constructor Chaining.

//	- We can achieve Constructor chaining in two ways.
//		i) this() call Statement
//		ii) super() call Statement

// 	i)this() call Statement
//		- this() call statement used to achieve Constructor Chaining between the Constructor within the same class.

// Rules :-
//		- this() call statement can only be use inside a Constructor.
//		- this() call statement must be 1st statement in Constructor body.
//		- Recursive call of the constructor is not called(i.e. Constructor calling itself).
//		- If there are N Constructor in the blueprint we can use maximum of n-1 this() call statement in the Constructor.
