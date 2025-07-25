package ProtectedModifier;

public class Q extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q1 = new Q();
//		System.out.println(test()); 
		System.out.println(a);
		
	}
}

//	- When I want to restrict the direct calling of the constructor from one package to another package, I make the constructor private or default.
//	- If I want to restrict the direct calling of the constructor OR Indirectly calling (Super() call) from one 1 package to another package, we make constructor protected.
//	- If I want to restrict the direct calling the constructor but want to allow indirect calling through super() call from 1 package to another package we make the constructor protected.
