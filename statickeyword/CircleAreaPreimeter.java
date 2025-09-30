package statickeyword;

public class CircleAreaPreimeter {
	static double pi = 22.0/7.0;
	public static void AreaOfCircle(int rad)
	{
		double area = pi * (rad * rad);
		System.out.println("Area of Circle is : " + area);
	}
	
	public static void PerimeterOfCircle(int rad)
	{
		double perimeter = 2 * pi * rad;
		System.out.println("Perimeter of Circle : " + perimeter);
	}
	public static void main(String args[])
	{
		System.out.println("Value of PI : "+ pi);
		AreaOfCircle(100);
		PerimeterOfCircle(100);
	}
}
