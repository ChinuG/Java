package NonStatic_Ex_01;

public class AC {
	String brand;
	double price;
	int ton;
	int maxTemp;
	int minTemp;
	int ambTemp;
	
	public void displayAC()
	{
		System.out.println("**************************");
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Ton : " + ton);
		System.out.println("Max Temp : " + maxTemp);
		System.out.println("Min Temp : " + minTemp);
		System.out.println("***********************");
	}
	
	public void displayMaxTemp()
	{
		System.out.println("Max Temperature is : " + maxTemp);
	}
	
	public void displayMinTemp()
	{
		System.out.println("Max Temperature is : " + minTemp);
	}
	
	public void displayAbientTemp()
	{
		System.out.println("Ambient Temperature : " + ambTemp);
	}
}
