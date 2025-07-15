package Palindrome;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		int temp = num;
		int reverse = 0;
		
		while(num > 0)
		{
			int last = num % 10;
			reverse = reverse * 10 + last;
			num/=10;
		}
		if(reverse == temp)
		{
			System.out.println(temp + " It is palindrome number");
		}
		else
		{
			System.out.println(temp + " Not an palindrome number");
		}
		
	}

}
