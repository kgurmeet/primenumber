import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        int m = 0, i = 2, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("the given number is not prime");

        } else {
            if (n % i == 0) {
                for (i = 2; i <= m; i++) {
                    System.out.println("Number is not prime");
                    break;

                }
            } else {
                System.out.println("Number is prime");
            }
        }
        sc.close();

    }
}
