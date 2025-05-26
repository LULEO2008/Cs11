import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter a non-negative integer: ");
            int number = scanner.nextInt();
            scanner.close();

            if (number < 0) {
                System.out.println("Error: Factorials do not work for negative numbers");
                return;
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.printf("The factorial of %d is: %d%n", number, factorial);
        }
    }