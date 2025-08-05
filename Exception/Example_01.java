package exception_Ex;
import java.util.Scanner;
public class Example_01 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Numerator : ");
		int num = sc.nextInt();
		System.out.print("Enter a Denomenator : ");
		int den = sc.nextInt();
		
		try
		{
			int result = num/den;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide by zero");
		}
		System.out.println("Thank you");
	}
}
