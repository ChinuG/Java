package recursion;
import java.util.Scanner;
public class Factorial_Recursion{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number : ");
		int num = sc.nextInt(); // Taking input from user.
		System.out.println(fact(num));
	}
	public static int fact(int num)
	{
		return num == 0 ? 1 : num * fact(num-1); // Recursive call i.e. fact(num-1).
	}
}
