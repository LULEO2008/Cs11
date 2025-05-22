package u4;
import java.util.Scanner;
public class Floydtriangle {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the number of rows:");
            int n = scanner.nextInt();
            int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
            scanner.close();
        }
    }

