package Has_A_Relation;

public class MobileDirver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("Xiome", "POCO M2 Pro", "Black", 14999.0, 6, 64);
		Mobile m2 = new Mobile("Realme", "Realme 6", "Blue", 14999.0, 6, 64);
		m2.displayMobile(2);
		m1.displayMobile(1);
		m1.b1.displayBattery();
	}
}

// **********************Relationship**********************

//	Define :- It is association between two or more entities.

// 	Relationships are classified into 2 types.
//	i) Has-A relationship
//	ii) Is-A relationship

//	i) Has-A relationship
//		- It is association between two or ore objects such that one object is dependent on another object.
//		- According to dependencies Has-A relationship is further classified into
//			a) Composition (One is completely dependent on another)
//			b) Aggregation (One object can exist without another)

//	a) Composition
//		- It is an association between two or more object such that one cannot exists without another.
//		- It is very similar to part and whole relationship.
//		Example :- Human & heart
//				   Car and Engine
//				   Bank & Account

//	b) Aggregation
//		- It is association between two objects, where there is a dependencies but here one object can exist without another.
//		Example :- Bat & Ball
//				   Horse & Cart
				   
//	How to achieve Has-A relationship
//		- An object must have reference of another object/
//		- We can easily achieve this design by creating the reference variable of one object inside another class.


//	- By considering above design we have achieved Has-A relationship where mobile object will the have reference of battery object.
//	- We can either achieve Composition or Aggregation by creating reference of one object(subclass) in another object(main object)
// 	- When the service user of the mobile class creates an object of mobile, automatically a battery object is created and it's reference is stored in object of mobile.
//	- We can achieve Has-A relationship using the following two designs.

//		1) Early Instantiation (Early binding / Tight Coupling)
//		2) Lazy Instantiation (Loose Coupling / Easy binding)

// 1) Early Instantiation
//	- In early Instantiation, the instance of dependent object is implicitly created when the instance of the class is created.














