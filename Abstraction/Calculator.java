package Abstraction;

public abstract class Calculator {
	public abstract void addition(int n1, int n2);
	
	public abstract void substraction(int n1, int n2);
	
	public void division(double num, double den)
	{
		double res = num/den;
		System.out.println(res);
	}
	
	public abstract void multiplication(int n1, int n2);
}
