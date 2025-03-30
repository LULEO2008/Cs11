package unit2project;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j <= i) {
                    System.out.print(num++);
                } else {
                    System.out.print(--num);
                }
            }
            System.out.println();
        }
    }
    
}
