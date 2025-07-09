package statickeyword;

public class StaticEx_01 {
	
	static double pi = 3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pi);
	
//		Method Calling
		areaOfCircle(100);
		perimeterOfCircle(100);
	}
	
	public static void areaOfCircle(double rad)
	{
		double area = pi * (rad * rad);
		System.out.println("Area of Circle is : " + area);
	}
	
	public static void perimeterOfCircle(double rad)
	{
		double perimeter = 2 * pi * rad;
		System.out.println("Perimeter of Circle is : " + perimeter);
	}
	
}
