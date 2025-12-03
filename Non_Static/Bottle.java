package NonStatic_Ex_01;

import java.util.Scanner;

public class Bottle {
	String brand = "Cello";
	double price;
	String color;
	double cap;
	String mat;
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Capacity");
		cap = sc.nextDouble();
	}
	
	{
		if(cap < 500)
		{
			price = 100;
		}
		else if(cap == 500)
		{
			price = 150;
		}
		else if(cap > 500)
		{
			price = 200;
		}
	}
	
//	public void displayBottle(String color, double cap)
//	{
//		this.color = color;
//		this.cap = cap;
//		
//		System.out.println(this.color);
//		System.out.println(this.cap);
//	}
	public void displayBottle(String color, double cap)
	{
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Color : " + color);
		System.out.println("cap : " + cap);
		System.out.println("Mat : " + mat);
	}
}
