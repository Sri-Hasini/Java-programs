//lcm
import java.util.Scanner;

public class LCMExample {
    // Method to calculate GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b); // Ensure the result is positive
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Calculate and display the LCM
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b));
    }
}
