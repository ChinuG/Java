package numberProgram;
// Check given number is prime or not.
public class PrimeNumber {
	public static void main(String args[])
	{
		int num = 9;
		int den = 2;
		while(den <= num)
		{
			if(num % den == 0)
			{
				break;
			}
			den++;
		}
		if(num/2 < den)
		{
			System.out.println(num + " Is a Prime Number");
		}
		else
		{
			System.out.println(num + " Is NOT a Prime Number");
		}
	}
}	
