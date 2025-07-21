package NullPointer;
import java.util.Scanner;
public class NullPointer {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = NULL; //Object is null. can't be loaded
		System.out.println(sc);
	}
}
