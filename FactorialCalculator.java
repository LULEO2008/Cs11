import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a non-negative integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Error: Factorials do not work for negative numbers");
            return;
        }

        long factorial = calculateFactorial(number);
        System.out.printf("The factorial of %d is: %d%n", number, factorial);
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}