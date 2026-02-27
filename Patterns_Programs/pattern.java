import java.util.Scanner;

class pattern {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if ((i == 1) || (i == n)) {
                    System.out.print(" * ");
                } else if ((j == 1) || (j == n)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        printPattern(num);
    }
}