import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个非负整数: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("错误：阶乘不适用于负数");
            return;
        }

        long factorial = calculateFactorial(number);
        System.out.printf("%d的阶乘是: %d%n", number, factorial);
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}