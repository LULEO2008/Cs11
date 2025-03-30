package unit2project;
import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int Max = 0;
        while (n > 0) {
            int n2 = n % 10;
        if (n2 > Max ) {
            Max = n2;
        }else{
          n2 = 0 ;
        }
        
        n /= 10;
        }
        System.out.println("The largest digit is = " + Max);
    }
    
}
