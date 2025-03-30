package unit2project;
import java.util.Scanner;
public class NumberSequence {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scan.nextInt();
        int num = n;
        while (num != 1) {
            System.out.print(num + " ");
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
        }
        System.out.println(1);
    }
}