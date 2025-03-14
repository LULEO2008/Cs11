import java.util.Scanner;
public class Project4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three number from 10-99 :");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int onesDigit = number1 % 10;
        int tensDigit = number1 / 10;

        int middleDigit =(number1+number2+number3)/3;
        System.out.println("ones-digit is " + onesDigit);
        System.out.println("tens-digit is " + tensDigit);
        System.out.println("Middle Digit is " + middleDigit);
        System.out.println("Enter side1 :");
        int side1 = scan.nextInt();
        System.out.println("Enter side2 :");
        int side2 = scan.nextInt();
        int perimeter = side1*2+ side2*2;
        int area = side1 * side2;
        System.out.println("Area is = " +area  );

        System.out.println("Perimeter is = "+ perimeter );

        System.out.println("Enter first number to swap:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number to swap:");
        int num2 = scan.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);



        scan.close();
    }
}
