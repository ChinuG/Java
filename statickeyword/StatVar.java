package statickeyword;

public class StatVar {
	static double balance;
	public static void credit(double amt)
	{
		if(amt > 0)
		{
			balance = balance + amt;
			System.out.println("Amout credited");
			System.out.println(balance);
		}
		else
		{
			System.out.println("Amount incorrect!");
		}
	}
	public static void debit(double amt)
	{
		if(amt > 0 && balance - amt > 2000)
		{
			balance = balance - amt;
			System.out.println("Amount debited!");
			System.out.println(balance);
		}
		else
		{
			System.out.println("Invalid or insufficient balance");
		}
	}
	public static void main(String args[])
	{
		System.out.println(balance);
		credit(10000);
		debit(100);
		System.out.println(balance);
	}
}
