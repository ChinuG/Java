package Aggregation;

public class Engin {
	double milage;
	double hp;
	String chasisNo;
	
	public Engin(double milage, double hp, String chasisNo)
	{
		this.milage = milage;
		this.hp = hp;
		this.chasisNo = chasisNo;
	}
	
	public void displayEngin()
	{
		System.out.println("Milage " + milage);
		System.out.println("HP" + hp);
		System.out.println("Chassis Number : " + chasisNo);
	}
}
