package Aggregation;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engin e = new Engin(24.9, 620.0, "WAUZZZ8RZAA100606");
		
		
		Car c1 = new Car("Audi", "93DF", 1898010.0, "Matt Black", 24900, "Dizel", e);
		System.out.println(c1.printCar());
		c1.e.displayEngin();
		
		
	}

}
