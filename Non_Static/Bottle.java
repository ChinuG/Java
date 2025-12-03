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
	
	public void displayBottle()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(color);
		System.out.println(cap);
		System.out.println(mat);
	}
}
