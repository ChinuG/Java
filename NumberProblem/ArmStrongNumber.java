package armstrongnumber;
// Armstrong Number using while loop
public class ArmStrongNumber {
	public static void isArmstrong(int n)
	{
		// 153
		int temp = n;
		int store = 0;
		while(n > 0)
		{
			int last = n % 10;
			store += last * last * last;
			n /= 10;
		}
		
		if(temp == store)
		{
			System.out.println(temp + " is Armstrong number");
		}
		else
		{
			System.out.println(temp + " is NOT an Armstrong number");
		}
	}
	public static void main(String args[])
	{
		isArmstrong(153);
	}
}

