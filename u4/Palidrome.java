package u4;
import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); 
        int original = num; 
        int reversed = 0;  

        while (num != 0) {
            reversed = reversed * 10 + num % 10;  
            num /= 10; 
        }

        if (original == reversed) { 
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    
    }
}
