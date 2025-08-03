import java.util.Scanner;
public class SumOF_N_NaturalNumbers 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        int sum = 0;
        int val = 1;
        while(val <= number)
        {
            sum = sum + val;
            val = val + 1;
        }

        System.out.print(sum);
    }    
}
