import java.util.Scanner;

class ScannerIntro {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// System.out.print("My name is : ");
		System.out.print("Enter your first name : ");
		String fristName = sc.next();

		System.out.print("Enter your last name : ");
		String lastName = sc.next();

		System.out.print("Address is : ");
		String address = sc.nextLine();

		System.out.print("My Age is : ");
		int age = sc.nextInt();

		// System.out.println("I am in 2nd year of MCA");
		System.out.print("My current CGPA :");
		float cgpa = sc.nextFloat();

		System.out.print("Enter your phone number : ");
		long phn = sc.nextLong();

		System.out.println(fristName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.print(age);
		System.out.println(cgpa);
		System.out.println(phn);
	}
}
