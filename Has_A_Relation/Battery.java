package Has_A_Relation;

public class Battery {
	String name;
	double price;
	int mah;
	
	Battery()
	{
		
	}
	
	Battery(String name, double price, int mah)
	{
		this.name = name;
		this.price = price;
		this.mah = mah;
	}
	
	public void displayBattery()
	{
		System.out.println("Battery");
		System.out.println("Name : " + name);
		System.out.println("Price : " + price);
		System.out.println("MAH : " + mah);
		System.out.println("*************************************");
	}
}
