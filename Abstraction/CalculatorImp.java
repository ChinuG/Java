package Abstraction;

public class CalculatorImp extends Calculator{
	public void addition(int a, int b)
	{
		int res = a + b;
		System.out.println(res);
	}
	
	public void substraction(int a, int b)
	{
		int res = a - b;
		System.out.println(res);
	}
	
	public void multiplication(int x, int y)
	{
		int res = x * y;
		System.out.println(res);
	}
}
