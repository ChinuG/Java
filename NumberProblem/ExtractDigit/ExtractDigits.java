package ExtractDigit;
import java.util.Scanner;
public class ExtractDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		while(num > 0)
		{
			int last = num % 10;
			System.err.println(last);
			num = num / 10;
//			num /= 10;
		}
	}
}
//	Extracting digit from last of given number by user
